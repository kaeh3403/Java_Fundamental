package java_201906018.UnicastServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UnicastServer {
	private ServerSocket serverSocket;

	public UnicastServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println("�ش�" + port + "�� ����ϰ��ֽ��ϴ�.");
			e.printStackTrace();
			// ���α׷� ����
			System.exit(0);
		}

		UnicastServerThread ust = null;

		while (true) {
			System.out.println("Ŭ���̾�Ʈ ���� �����");
			Socket socket = null;
			try {
				socket = serverSocket.accept();
				System.out.println("clinet ip : " + socket.getInetAddress().getHostAddress());
				ust = new UnicastServerThread(socket);
				Thread t = new Thread(ust);
				t.start();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new UnicastServer(3002);
	}
}
