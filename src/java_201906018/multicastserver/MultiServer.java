package java_201906018.multicastserver;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	private ServerSocket serverSocket;
	private ArrayList<MultiServerThread> list;
	public MultiServer(int port){
		
		list = new ArrayList<MultiServerThread>();
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port+"번호를 사용하고 있습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		
		MultiServerThread mst = null;
		
		while(true){
			System.out.println("클라이언트 접속을 대기하고 있습니다.");
			Socket socket = null;
			
			try {
				socket = serverSocket.accept();
				System.out.println("clinet ip : "+
						socket.getInetAddress().getHostAddress());
				
				mst = new MultiServerThread(socket,list);
				
				list.add(mst);
				
				Thread t = new Thread(mst);
				t.start();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		//UnicastServer us = new UnicastServer(3002);
		new MultiServer(3003);
	}
}