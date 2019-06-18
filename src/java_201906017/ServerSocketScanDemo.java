package java_201906017;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScanDemo extends Thread {
	@Override
	public void run() {
		ServerSocket s = null;
		for (int i = 0; i < 65535; i++) {
			try {
				//ServerSocket Ŭ������ �ش� ������  port��ȣ�� ����� �� ������ ServerSocket ��ü�� ������ �� �ְ�, ���ܸ� �߻��ϴ� ����
				//�ش� port�� ����ϴ� ����̴�.
				s = new ServerSocket(i);
				
			} catch (IOException e) {
				System.out.println(i + "��ȣ�� ����� �� �����ϴ�.");
			}
		}

	}

	public static void main(String[] args) {
		ServerSocketScanDemo s = new ServerSocketScanDemo();
		s.start();
	}
}
