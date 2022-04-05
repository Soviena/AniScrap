import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
public class Scrapper {
    public static Document parseWeb(String url) {
        try {
            Document page = Jsoup.connect(url).get();
            return page;
        } catch (IOException e) {
            System.out.println("Failed : "+e);
            e.printStackTrace();
            return null;
        }
    }
}
