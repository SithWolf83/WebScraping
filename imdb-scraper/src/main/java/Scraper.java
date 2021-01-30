import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Scraper {

	public static void main(String[] args) throws Exception {
		
		final Document document = Jsoup.connect("https://www.imdb.com/chart/top").get();
		
		// "table" means the elements are in a table
		// "chart.full-width" means the name of the table
		// "tr" means is taking the rows of the table
		for (Element row : document.select("table.chart.full-width tr")) {
			final String title = row.select(".titleColumn a").text();		// "a" because we want <a href> tag.
			final String rating = row.select(".imdbRating").text();
			System.out.println(title + " -> Rating: " + rating);
		}

	}

}
