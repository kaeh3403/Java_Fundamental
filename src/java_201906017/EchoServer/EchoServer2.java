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

public class EchoServer2 {
	int port;
	ServerSocket serverSocket;
	
	
	public EchoServer2(int port){
		this.port = port;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		while(true){
			System.out.println("클라이던트 접속 대기중");
			try {
				Socket socket = serverSocket.accept();
				
				
				InetAddress ia = socket.getInetAddress();
				String ip = ia.getHostAddress();
				System.out.println("입장 : IP : "+ip);
				
				InputStream in = socket.getInputStream();
				InputStreamReader ir = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(ir);
				String readLine = br.readLine();
				System.out.println("클라이던트 접속");
				
				
				
				
				
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
		new EchoServer(3002);
	}
}
