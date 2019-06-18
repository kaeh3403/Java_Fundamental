package java_201906013;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JtbcNewsCrawling {
	public static void main(String[] args) {
		String url = "http://news.jtbc.joins.com/";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		Elements elements = doc.select(".list_area.popupar_jtbcnews");
		
		String title = elements.select("h3").text();
		System.out.println(title);
		
		for(Element temp : elements.select("li")){
			System.out.println(temp.text());
		}
				
				
		
		
		
		
		
	
	}
}
