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
	//���� ��¥�� �ѱ۳�¥�� �����ϱ����� �޼ҵ�
	private String getKoreanDate(String date) {
		
		String koreanDate = null;
		SimpleDateFormat from = new SimpleDateFormat("mmm dd, yyyy",Locale.US);
		
		SimpleDateFormat to = new SimpleDateFormat("yyyy�� mm�� dd��",Locale.KOREAN);
		try {
			java.util.Date d = from.parse(date);
			koreanDate = to.format(d);
					
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return koreanDate;
	}
	
	
	
	
	public void execute(String coinName,String startDate, String endDate){
		
		HSSFWorkbook workbook = new HSSFWorkbook(); // �� ���� ����
		HSSFSheet sheet = workbook.createSheet(coinName); // �� ��Ʈ(Sheet) ����
        HSSFRow row = sheet.createRow(0); // ������ ���� 0������ ����
        HSSFCell cell = row.createCell(0); // ���� ���� 0������ ����
		
		String url = "https://coinmarketcap.com/currencies/"+coinName+"/historical-data/?start="+startDate+"&end="+endDate;
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//headElements �� Ÿ��Ʋ ������ �������� ���� Elements
		Elements headElements = doc.select(".table-responsive .table thead tr");
		
		//bodyElements �� Ÿ��Ʋ ������ �������� ���� Elements
		Elements bodyElements = doc.select(".table-responsive .table tbody tr");
		int lowIndex = 0;
		
		for (int i = 0; i < headElements.size(); i++) {
			row = sheet.createRow(lowIndex++); // ������ ���� 0������ ����
			cell = row.createCell(0); // ���� ���� 0������ ����
			cell.setCellValue("�׽�Ʈ 1"); // ������ ���� ������ ����
			Element e = (Element) headElements.get(i);

			String data = e.child(0).text();
			cell = row.createCell(0); // ���� ���� 0������ ����
			cell.setCellValue(data); // ������ ���� ������ ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
			cell.setCellValue(open); // ������ ���� ������ ����
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
			cell.setCellValue(high); // ������ ���� ������ ����
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
			cell.setCellValue(low); // ������ ���� ������ ����
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
			cell.setCellValue(close); // ������ ���� ������ ����
			
			String volume = e.child(5).text();
			cell = row.createCell(5); // ���� ���� 0������ ����
			cell.setCellValue(volume); // ������ ���� ������ ����
			
			String marketCap = e.child(6).text();
			cell = row.createCell(6); // ���� ���� 0������ ����
			cell.setCellValue(marketCap); // ������ ���� ������ ����

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
			row = sheet.createRow(lowIndex++); // ������ ���� 0������ ����
			Element e = (Element) bodyElements.get(i);
			String data = e.child(0).text();
			cell = row.createCell(0); // ���� ���� 0������ ����
			cell.setCellValue(getKoreanDate(data)); // ������ ���� ������ ����
			
			String open = e.child(1).text();
			cell = row.createCell(1); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(open)); // ������ ���� ������ ����
			
			String high = e.child(2).text();
			cell = row.createCell(2); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(high)); // ������ ���� ������ ����
			
			String low = e.child(3).text();
			cell = row.createCell(3); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(low)); // ������ ���� ������ ����
			
			String close = e.child(4).text();
			cell = row.createCell(4); // ���� ���� 0������ ����
			cell.setCellValue(Double.parseDouble(close)); // ������ ���� ������ ����
			
			String volume = e.child(5).text();//"18,66,407,147"
			volume = volume.replaceAll(",", "");//���ڷ� �����ϱ����� ,�� ����
			cell = row.createCell(5); // ���� ���� 0������ ����
			cell.setCellValue(Long.parseLong(volume)); // ������ ���� ������ ����
			
			String marketCap = e.child(6).text();
			marketCap = marketCap.replaceAll(",", "");
			cell = row.createCell(6); // ���� ���� 0������ ����
			cell.setCellValue(Long.parseLong(marketCap)); // ������ ���� ������ ����

			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s%n", data, open, high, low, close, volume, marketCap);
		}
		 try {
	        	FileOutputStream fileoutputstream = new FileOutputStream("c:\\down\\"+coinName+".xls");
	            workbook.write(fileoutputstream);
	            fileoutputstream.close();
	            System.out.println("�������ϻ�������");
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("�������ϻ�������");
	        }
	}
	public static void main(String[] args) {
		CoinCrawling_Upgrade c = new CoinCrawling_Upgrade();
		c.execute("bitcoin","20180614","20190614");
		c.execute("ethereum","20180614","20190614");
		c.execute("ripple","20180614","20190614");
		
	}
}
