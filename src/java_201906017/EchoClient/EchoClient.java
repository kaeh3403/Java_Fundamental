package java_201906017.EchoClient;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	private Socket socket;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;

		try {
			// 3,4. Socket객체를 생성한다.
			socket = new Socket(ip, port);

			// 7. 서버와 통신 할 수 있는 Socket 객체 생성

			// 8. 서버와 통신 할 수 있는 in, out 스트림 생성
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("안녕하세요, 저는 김성규입니다.");
			//개행을 해야 가능
			bw.newLine();
			bw.flush();

			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.165", 3000);
	}
}
