package java_201906012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("c:\\down\\HelloWorld.java");
			br = new BufferedReader(fr);
			fw = new FileWriter("c:\\down\\2019\\HelloWorld.java");
			bw = new BufferedWriter(fw);
			
			String readLine = null;
			//br.readLine은 개행은 읽지 않음. 따라서 개행을 추가해주어야함
			while((readLine = br.readLine()) != null){
				bw.write(readLine);
				bw.newLine();
				
			}
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
