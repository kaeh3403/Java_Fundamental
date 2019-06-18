package java_201906013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 
public class Excel { public static void main(String[] args) {
	Workbook wb = new HSSFWorkbook();  // or new XSSFWorkbook();
    Sheet sheet1 = wb.createSheet("Bitcoin");
    Sheet sheet2 = wb.createSheet("Ethereum");
    Sheet sheet3 = wb.createSheet("XRP");
    

    // 시트에 행생성(행순서)

	Row bit = sheet1.createRow(0);
	Row eth = sheet2.createRow(0);
	Row xrp = sheet3.createRow(0);
	

    // 열에 값 입력(열 순서)    
    Cell cell = bit.createCell(0);
    cell = bit.createCell(0);
    cell.setCellValue("Date");

    cell = bit.createCell(1);
    cell.setCellValue("Open");
    
    cell = bit.createCell(2);
    cell.setCellValue("High");
    
    cell = bit.createCell(3);
    cell.setCellValue("Low");
    
    cell = bit.createCell(4);
    cell.setCellValue("Volume");
    
    cell = bit.createCell(5);
    cell.setCellValue("Market Cap");
    

    try (OutputStream fileOut = new FileOutputStream("c:\\down\\workbook.xls")) {
        wb.write(fileOut);
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}
}

