package java_201906018.multicastclient;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient implements ActionListener{
	private String id;
	private String ip;
	private int port ;
	private JFrame jframe ;
	private JTextArea jta;
	private JPanel jp1, jp2;
	private JLabel jl1, jl2;
	private JTextField jtf;
	private JButton jbtn;
	private PrintWriter pw;
	private BufferedReader br;
	private Socket socket;
	public MultiClient(String id,String ip, int port) {
		this.id = id;
		this.ip = ip;
		this.port = port;
		jframe = new JFrame("Unicast Chatting");
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jl1 = new JLabel("Usage ID : ["+id+"]");
		jl2 = new JLabel("IP : "+ip);
		
		
		jp1.setLayout(new BorderLayout());
		jp1.add(jl1,BorderLayout.CENTER);
		jp1.add(jl2, BorderLayout.EAST);
		
		jtf = new JTextField(30);
		jtf.addActionListener(this);
		
		
		jbtn = new JButton("전송");	
		jbtn.addActionListener(this);
		
		jp2.setLayout(new BorderLayout());
		jp2.add(jtf,BorderLayout.CENTER);
		jp2.add(jbtn, BorderLayout.EAST);
		
		jta = new JTextArea("",5,50);
		jta.setEditable(false);
		jta.setBackground(Color.YELLOW);
		
		
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		jframe.add(jsp,BorderLayout.CENTER);
		jframe.add(jp1,BorderLayout.NORTH);
		jframe.add(jp2,BorderLayout.SOUTH);
		
		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);
		
		jframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				pw.println("exit");
				/*String readLine = null;
				try {
					readLine = br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(readLine != null && readLine.equals("exit")){
					try {
						if(br != null) br.close();
						if(pw != null) pw.close();
						if(socket != null) socket.close();
						
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					System.exit(0);
				}*/
			}
		});
	}
	
	

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj == jtf){
			
			String message = jtf.getText();
			//시스템마다 개행이 다를때 코딩하는거.
			//System.getProperty("line.separator") => \n이랑 비슷한거
			sendMessage(message);
			//jta.append(readLine);
			jtf.setText("");
		}else if(obj == jbtn){
			
			String message = jtf.getText();
			sendMessage(message);
			//jta.append(readLine);
			jtf.setText("");
		}
	}





	private void sendMessage(String message) {
		pw.println(id + " : "+message);//server에게 메세지 보냄
		/*
		String readLine = null;
		try {
			readLine = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		readLine += System.getProperty("line.separator");
		*/
		//return readLine;
	}
	
	public void connect(){
		try {
			socket = new Socket(ip,port);
			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(
					new BufferedWriter(
					new OutputStreamWriter(out)),true);//true => auto flush
			
			InputStream in = socket.getInputStream();
			br = new BufferedReader(
					new InputStreamReader(in));
			
			MultiClientThread mct = new MultiClientThread(br, jta);
			Thread t = new Thread(mct);
			t.start();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);;
		MultiClient uc = new MultiClient(
				"aa","192.168.0.147",3003);
		uc.connect();
	}

}