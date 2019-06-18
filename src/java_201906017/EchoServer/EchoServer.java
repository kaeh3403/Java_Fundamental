package java_201906017.EchoServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	private ServerSocket serverSocket;

	public EchoServer(int port) {
		this.port = port;
		try {
			// 1.ServerSocket을 생성한다.
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다.");

			try {
				// accept()메서드는 블락킹 메서드
				// 클라이언트가 접속하기 전까지는 수행되지 않는 블락킹 메서드
				// 2. 클라이언트 접속을 대기한다
				Socket socket = serverSocket.accept();
				//4,5 서버와  TCP 커넥션이 만들어지면서 서버와 통신할 수 있는 Socket 객체가 생성된다.
				
				// 5,7. 클라이언트와 통신할 수 있는 Socket을 생성
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();

				System.out.println("클라이언트가 접속하였습니다. IP : " + ip);
				
				//9. 클라이언트와 통신 할 수 있는 in,out 스트림 생성
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
				
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new EchoServer(3000);
	}
}
