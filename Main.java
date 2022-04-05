import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Website anoboy = new Website("https://anoboy.online/search/prince");
        Document page = Scrapper.parseWeb(anoboy.url);
        System.out.println(page);
        Elements articles = page.getElementsByTag("article");
        for (Element article : articles){
            System.out.println(article.toString());
        }
    }
}