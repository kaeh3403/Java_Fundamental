package java_201906012;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStringDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		//PrintStream 은 목적지
		PrintStream ps = null;
		try {
			fis = new FileInputStream("C:\\down\\eclipse.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\down\\2019\\eclipse.zip");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);//true => autoFlush
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while ((readByteCount = bis.read(readBytes)) != -1) {
				ps.write(readBytes,0,readByteCount);
			}
			
			//PrintStream 의 목적지를 모니터로 
			PrintStream ps1 = System.out;
			ps1.println(1);
			ps1.println("aa");
			ps1.println(42.5);
			
			
		} catch (IOException e) {
			// TODO: handle exception
			
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(ps != null) ps.close();
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
