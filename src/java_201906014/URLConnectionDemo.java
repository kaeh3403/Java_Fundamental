package java_201906014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://sports.news.naver.com/kfootball/news/read.nhn?oid=436&aid=0000032174");
		
		URLConnection urlcon = url.openConnection();
		
		String server = urlcon.getHeaderField("Server");
		String cacheControl = urlcon.getHeaderField("Cache-Control");
		String expires = urlcon.getHeaderField("Expires");
		String contentType = urlcon.getHeaderField("content-type");
		String location = urlcon.getHeaderField("location");
		String connection = urlcon.getHeaderField("connection");
		String setCookie = urlcon.getHeaderField("setCookie");
		int len = urlcon.getContentLength();
		
		System.out.println("Server : "+server);
		System.out.println("Cache-Control : "+ cacheControl);
		System.out.println("expires:"+expires);
		System.out.println("contentType:"+contentType);
		System.out.println("location:"+location);
		System.out.println("connection:"+connection);
		System.out.println("setCookie:"+setCookie);
		System.out.println("len:"+len);

		InputStream in = urlcon.getInputStream();
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		String readLine = br.readLine();
		
		while((readLine = br.readLine()) != null){
			System.out.println(br.readLine());
		}
		
	}
}
