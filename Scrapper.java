import java.io.IOException;
import org.jsoup.*;
import org.jsoup.Connection.Base;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.Base64;
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

    public static String decodeBase64(String encoded){
        Base64.Decoder decode = Base64.getDecoder();   
        return new String(decode.decode(encoded));
    }

    public static String uservideo(String url){
        return parseWeb(url).getElementsByTag("iframe").first().attr("src");
    }
}
