package java_20190531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarDemo {
	//Ű����� �Է¹��� ������ ��ȯ�ϴ� �Լ�
	public static String console() throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		return br.readLine();
	}
	
	public static void main(String[] args) throws IOException{
		Calendar c = null;
		
		while(true){
		System.out.println("��¥�� �Է��ϼ���>");
		String readLine = console();
		if(readLine.equals("bye")) break;
		//split("") ���鹮�ڷ� ���ڿ��� �и��ؼ� �迭�� ��ȯ
		String[] data = readLine.split(" ");
		
		//Calendar ��ü�� �����ؼ� �Ʒ��� ��� ��쿡 ����Ѵ�.
		c = new Calendar();
		
		//data.length �迭�� ����
		if(data.length == 1){
			//Integer.parseInt ���ڿ��� int�� �ٲ��ִ� �޼���
			int year = Integer.parseInt(data[0]);
			c = new Calendar();
			c.print(year);
		}else if(data.length == 2){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			c = new Calendar();
			c.print(year,month);
		}else if(data.length == 3){
			int year = Integer.parseInt(data[0]);
			int month = Integer.parseInt(data[1]);
			int day = Integer.parseInt(data[2]);
			c = new Calendar();
			c.print(year,month,day);
		}else{
			
		}
		
		
		}
	}
}
