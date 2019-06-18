package java_201906013;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class practice {
	
	public static void main(String[] args) {
		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 생성
		HSSFSheet sheet = workbook.createSheet("가즈아"); // 새 시트(Sheet) 생성
        HSSFRow row = sheet.createRow(0); // 엑셀의 행은 0번부터 시작
        HSSFCell cell = row.createCell(0); // 행의 셀은 0번부터 시작
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20180613&end=20190613";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
					
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".table-responsive .table ");
		
		String title = elements.select("tbody").text();
		//System.out.println(title);
		

		for(Element temp : elements.select("")){
			System.out.println(temp);
		
		
	}
        



		
	}	
}
