package java_201906014;


import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Locale;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinCrawling_Upgrade {
	//영문 날짜를 한글날짜로 변경하기위한 메소드
	private String getKoreanDate(String date) {
		
		String koreanDate = null;
		SimpleDateFormat from = new SimpleDateFormat("mmm dd, yyyy",Locale.US);
		
		SimpleDateFormat to = new SimpleDateFormat("yyyy년 mm월 dd일",Locale.KOREAN);
		try {
			java.util.Date d = from.parse(date);
			koreanDate = to.format(d);
					
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return koreanDate;
	}
	
	
	
	
	public void execute(String coinName,String startDate, String endDate){
		
		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
		HSSFSheet sheet = workbook.createSheet(coinName); // 새 시트(Sheet) 생성
        HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
        HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
		
		String url = "https://coinmarketcap.com/currencies/"+coinName+"/historical-data/?start="+startDate+"&end="+endDate;
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
			Element e = (Element) bodyElements.get(i);
			String data = e.child(0).text();
			cell = row.createCell(0); // 행의 셀은 0번부터 시작
			cell.setCellValue(getKoreanDate(data)); // 생성한 셀에 데이터 삽입
			
			String open = e.child(1).text();
			cell = row.createCell(1); // 행의 셀은 0번부터 시작
			cell.setCellValue(Double.parseDouble(open)); // 생성한 셀에 데이터 삽입
			
			String high = e.child(2).text();
			cell = row.createCell(2); // 행의 셀은 0번부터 시작
			cell.setCellValue(Double.parseDouble(high)); // 생성한 셀에 데이터 삽입
			
			String low = e.child(3).text();
			cell = row.createCell(3); // 행의 셀은 0번부터 시작
			cell.setCellValue(Double.parseDouble(low)); // 생성한 셀에 데이터 삽입
			
			String close = e.child(4).text();
			cell = row.createCell(4); // 행의 셀은 0번부터 시작
			cell.setCellValue(Double.parseDouble(close)); // 생성한 셀에 데이터 삽입
			
			String volume = e.child(5).text();//"18,66,407,147"
			volume = volume.replaceAll(",", "");//숫자로 변경하기위해 ,를 제거
			cell = row.createCell(5); // 행의 셀은 0번부터 시작
			cell.setCellValue(Long.parseLong(volume)); // 생성한 셀에 데이터 삽입
			
			String marketCap = e.child(6).text();
			marketCap = marketCap.replaceAll(",", "");
			cell = row.createCell(6); // 행의 셀은 0번부터 시작
			cell.setCellValue(Long.parseLong(marketCap)); // 생성한 셀에 데이터 삽입

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", data, open, high, low, close, volume, marketCap);
		}
		 try {
	        	FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\"+coinName+".xls");
	            workbook.write(fileoutputstream);
	            fileoutputstream.close();
	            System.out.println("엑셀파일생성성공");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("엑셀파일생성실패");
	        }
	}
	public static void main(String[] args) {
		CoinCrawling_Upgrade c = new CoinCrawling_Upgrade();
		c.execute("bitcoin","20180614","20190614");
		c.execute("ethereum","20180614","20190614");
		c.execute("ripple","20180614","20190614");
		
	}
}
