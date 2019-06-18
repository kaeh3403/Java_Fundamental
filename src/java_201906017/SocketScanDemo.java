package java_201906017;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo extends Thread{
	@Override
	public void run() {
		Socket s = null;
		for (int i = 20; i < 80; i++) {
			//Socket ��ü�� �����Ǿ��ٴ� ���� host, port�� ����� �� �ֱ� ������ �ش� host,port�� ������̶�� ���.
			try {
				s = new Socket("127.0.0.1", i);
				System.out.println(i + "��ȣ�� ������Դϴ�.");
			} catch (UnknownHostException e) {
				System.out.println("�ش� ȣ��Ʈ�� �߸��Ǿ����ϴ�.");
			} catch (IOException e) {
				System.out.println(i + "��ȣ�� ����ϰ����� �ʽ��ϴ�..");
			}
			
		}


	}
	public static void main(String[] args) {
		SocketScanDemo s = new SocketScanDemo();
		s.start();
				
	}
}
