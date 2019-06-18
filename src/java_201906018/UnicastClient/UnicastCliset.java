package java_201906018.UnicastClient;

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

public class UnicastCliset implements ActionListener {
	private String id;
	private String ip;
	private int port;
	private JFrame jframe;
	private JTextArea jta;
	private JPanel jp1, jp2;
	private JLabel jl1, jl2;
	private JTextField jtf;
	private JButton jbtn;
	private PrintWriter pw;
	private BufferedReader br;
	private Socket socket;
	
	public UnicastCliset(String id, String ip, int port) {
		this.id = id;
		this.ip = ip;
		this.port = port;
		jframe = new JFrame("Unicast Chartting");
		jp1 = new JPanel();
		jp2 = new JPanel();

		jl1 = new JLabel("Usage ID : [" + id + "]");
		jl2 = new JLabel("ip : " + ip);

		jp1.setLayout(new BorderLayout());
		jp1.add(jl1, BorderLayout.CENTER);
		jp1.add(jl2, BorderLayout.EAST);

		jtf = new JTextField(30);
		jtf.addActionListener(this);
		jbtn = new JButton("Àü¼Û");
		jbtn.addActionListener(this);

		jp2.setLayout(new BorderLayout());
		jp2.add(jtf, BorderLayout.CENTER);
		jp2.add(jbtn, BorderLayout.EAST);

		jta = new JTextArea("", 5, 50);
		jta.setEditable(false);
		jta.setBackground(Color.pink);
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(jp1, BorderLayout.NORTH);
		jframe.add(jp2, BorderLayout.SOUTH);

		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);
		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if (obj == jtf) {
			String message = jtf.getText();
			pw.println(id + " : " + message);
			
			String readLine = null;
			try {
				readLine = br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			readLine += System.getProperty("line.separator");
			jta.append(readLine);
			jtf.setText("");

		} else if (obj == jbtn) {
			String message = jtf.getText();
			message += System.getProperty("line.separator");
			jta.append(id + " : " + message);
			jtf.setText("");

		}

	}

	public void connect() {
		try {
			Socket socket = new Socket(ip, port);

			OutputStream out = socket.getOutputStream();
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out)), true);

			InputStream in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(in));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String readLine = null;
		try {
			readLine = br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(readLine != null && readLine.equals("exit")){
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		UnicastCliset uc = new UnicastCliset("id", "192.168.0.165", 3002);
		uc.connect();
	}
}
