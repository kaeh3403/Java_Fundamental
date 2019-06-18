package java_201906012;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("c:\\down\\eclipse.zip");
			//stream chainning
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c:\\down\\2019\\eclipse.zip");
			//stream chainning
			bos = new BufferedOutputStream(fos);
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024];
			while ((readByteCount = bis.read(readBytes)) != -1) {
				bos.write(readBytes,0,readByteCount);
			}
			//버퍼공간이 다 차있지 않더라도 버퍼공간을 비워주는 역할
			bos.flush();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
