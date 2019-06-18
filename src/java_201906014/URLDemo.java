package java_201906014;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://sports.news.naver.com/kfootball/news/read.nhn?oid=436&aid=0000032174");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
				
		System.out.printf("protocol:%s, host:%s, path:%s, query:%s, ref:%s",protocol,host,port,path,query,ref);
				
		
		InputStream in = url.openStream();
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		String readLine = br.readLine();
		
		while((readLine = br.readLine()) != null){
			System.out.println(br.readLine());
			
		
		/*try {
			while((readLine = br.readLine()) != null){
				System.out.println(br.readLine());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ir != null) ir.close();
				if(br != null) br.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}*/
				
	}
}
}
