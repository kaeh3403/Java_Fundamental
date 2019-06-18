package java_201906017.EchoClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient3 {
	private String ip;
	private int port;
	private Socket socket;
	
	
	public EchoClient3(String ip, int port) {
		this.ip = ip;
		this.port = port;
		
		try {
			socket = new Socket(ip,port);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(ow);
			bw.write("æ»≥Á«œººø‰");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(ir);
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
		new EchoClient3("192.168.0.165", 3003);
		

	}
}
