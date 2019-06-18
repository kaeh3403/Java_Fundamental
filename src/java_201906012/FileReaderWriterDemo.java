package java_201906012;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			fw = new FileWriter("c:\\down\\2019\\HelloWorld.java");
			//�Ѱ��� ���ڸ� �о �Ѱ��� ���ڸ� ����ϴ� ��
			/*int readChar = 0;
			while((readChar = fr.read()) != -1){
				System.out.print((char)readChar);
				fw.write(readChar);
			}
			fw.flush();*/
			//�������� ����(char �迭)�� �о �������� ����(char �迭)�� ����ϴ� ����
			int readCharCount = 0;
			char[] readChars = new char[1024];
			while((readCharCount = fr.read(readChars)) != -1){
				fw.write(readChars,0,readCharCount);
				
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}