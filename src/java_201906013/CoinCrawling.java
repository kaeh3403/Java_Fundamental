package java_201906013;


import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling {
	public void execute(){
		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
		HSSFSheet sheet = workbook.createSheet("가즈아"); // 새 시트(Sheet) 생성
        HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
        HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
		
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//headElements 는 타이틀 정보를 가져오기 위한 Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");
		
		//bodyElements 는 타이틀 정보를 가져오기 위한 Elements
		Elements bodyElements = doc.select(".table-responsive .table tbody tr");
		int lowIndex = 0;
		
		for (int i = 0; i < headElements.size(); i++) {
			row = sheet.createRow(lowIndex++); // 엑셀의 행은 0번부터 시작
			cell = row.createCell(0); // 행의 셀은 0번부터 시작
			cell.setCellValue("테스트 1"); // 생성한 셀에 데이터 삽입
			Element e = (Element) headElements.get(i);

			String data = e.child(0).text();
			cell = row.createCell(0); // 행의 셀은 0번부터 시작
			cell.setCellValue(data); // 생성한 셀에 데이터 삽입
			
			String open = e.child(1).text();
			cell = row.createCell(1); // 행의 셀은 0번부터 시작
			cell.setCellValue(open); // 생성한 셀에 데이터 삽입
			
			String high = e.child(2).text();
			cell = row.createCell(2); // 행의 셀은 0번부터 시작
			cell.setCellValue(high); // 생성한 셀에 데이터 삽입
			
			String low = e.child(3).text();
			cell = row.createCell(3); // 행의 셀은 0번부터 시작
			cell.setCellValue(low); // 생성한 셀에 데이터 삽입
			
			String close = e.child(4).text();
			cell = row.createCell(4); // 행의 셀은 0번부터 시작
			cell.setCellValue(close); // 생성한 셀에 데이터 삽입
			
			String volume = e.child(5).text();
			cell = row.createCell(5); // 행의 셀은 0번부터 시작
			cell.setCellValue(volume); // 생성한 셀에 데이터 삽입
			
			String marketCap = e.child(6).text();
			cell = row.createCell(6); // 행의 셀은 0번부터 시작
			cell.setCellValue(marketCap); // 생성한 셀에 데이터 삽입

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", data, open, high, low, close, volume, marketCap);
		}
			
		for (int i = 0; i < bodyElements.size(); i++) {
			Element e = (Element)bodyElements.get(i);
			String data = e.child(0).text();
			String open = e.child(1).text();
			String high = e.child(2).text();
			String low = e.child(3).text();
			String close = e.child(4).text();
			String volume = e.child(5).text();
			String marketCap = e.child(6).text();
			
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n",data,open,high,low,close,volume,marketCap);
		}
		for (int i = 0; i < bodyElements.size(); i++) {
			row = sheet.createRow(lowIndex++); // 엑셀의 행은 0번부터 시작
			cell = row.createCell(0); // 행의 셀은 0번부터 시작
			cell.setCellValue("테스트 1"); // 생성한 셀에 데이터 삽입
			Element e = (Element) bodyElements.get(i);

			String data = e.child(0).text();
			cell = row.createCell(0); // 행의 셀은 0번부터 시작
			cell.setCellValue(data); // 생성한 셀에 데이터 삽입
			
			String open = e.child(1).text();
			cell = row.createCell(1); // 행의 셀은 0번부터 시작
			cell.setCellValue(open); // 생성한 셀에 데이터 삽입
			
			String high = e.child(2).text();
			cell = row.createCell(2); // 행의 셀은 0번부터 시작
			cell.setCellValue(high); // 생성한 셀에 데이터 삽입
			
			String low = e.child(3).text();
			cell = row.createCell(3); // 행의 셀은 0번부터 시작
			cell.setCellValue(low); // 생성한 셀에 데이터 삽입
			
			String close = e.child(4).text();
			cell = row.createCell(4); // 행의 셀은 0번부터 시작
			cell.setCellValue(close); // 생성한 셀에 데이터 삽입
			
			String volume = e.child(5).text();
			cell = row.createCell(5); // 행의 셀은 0번부터 시작
			cell.setCellValue(volume); // 생성한 셀에 데이터 삽입
			
			String marketCap = e.child(6).text();
			cell = row.createCell(6); // 행의 셀은 0번부터 시작
			cell.setCellValue(marketCap); // 생성한 셀에 데이터 삽입

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", data, open, high, low, close, volume, marketCap);
		}
		 try {
	        	FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\excel.xls");
	            workbook.write(fileoutputstream);
	            fileoutputstream.close();
	            System.out.println("엑셀파일생성성공");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("엑셀파일생성실패");
	        }
	
	}
	
	public static void main(String[] args) {
			
	}
}
