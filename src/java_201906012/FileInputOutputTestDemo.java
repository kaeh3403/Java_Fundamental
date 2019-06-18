package java_201906012;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputTestDemo {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileOutputStream fos = null;
		try {
			fin = new FileInputStream("c:\\");
			fos = new FileOutputStream("c:\\");
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1];
			while((readByteCount = fin.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
			}
		} catch (IOException e) {
		
		} finally {
			try {
				if(fin != null) fin.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
