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
			System.out.println("해당" + port + "를 사용하고있습니다.");
			e.printStackTrace();
			// 프로그램 종료
			System.exit(0);
		}

		UnicastServerThread ust = null;

		while (true) {
			System.out.println("클라이언트 접속 대기중");
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
