package java_201906011;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos= null;
		try {
			fin = new FileInputStream("c:\\down\\eclipse.zip");
			fos = new FileOutputStream("c:\\down\\2019\\eclipse.zip");
	/*		int readByte = 0;
			while((readByte = fin.read()) != -1){
				fos.write(readByte);
				*/
			long start = System.currentTimeMillis();
			
			int readByteCount = 0;
			byte[] readBytes = new byte[10240];
			while((readByteCount = fin.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
				
			}
			
			long end = System.currentTimeMillis();
		
			System.out.println("경과시간 : "+(end-start));
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fin != null) fin.close();
					if(fos != null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
