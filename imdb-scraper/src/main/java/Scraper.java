import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Scraper {

	public static void main(String[] args) throws Exception {
		
		final Document document = Jsoup.connect("https://www.imdb.com/chart/top").get();
		System.out.println(document.outerHtml());

	}

}
