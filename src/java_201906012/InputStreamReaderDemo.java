package java_201906012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	
	InputStream in = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	FileWriter fw = null;
	BufferedWriter bw = null;
	PrintWriter pw = null;
	
	try {
		//키보드로 입력을 받음. 다시말해 InputStream을 사용할 떄 Source(대상)가 키보드인 경우
		InputStream in = System.in;
		//1바이트 입력 스트림을 2바이트 입력스트림으로 변환
		ir = new InputStreamReader(in);
		br = new BufferedReader(ir);
		
		fw = new FileWriter("c:\\down\\temp.txt");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		System.out.print("입력하세요 > ");
		String readLine = br.readLine();
		if(readLine.equals("exit")){
			isStop = true;
		}else{
		pw.println(readLine);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if(in != null) in.close();
			if(ir != null) ir.close();
			if(br != null) br.close();
			if(fw != null) fw.close();
			if(bw != null) bw.close();
			if(pw != null) pw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
