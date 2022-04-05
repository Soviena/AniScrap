import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Website {
    private String url;
    private String searchUrl;
    public Website(String url){
        this.url = url;
    }
    public void setSearchUrl(String slug) {
        this.searchUrl = this.url+"/"+slug;
    }

    public Elements searchAnime(String query) {
        // System.out.println(page);
        Elements articles = Scrapper.parseWeb(this.searchUrl+query).getElementsByClass("inf");
        Elements animes = new Elements();
        for (Element article : articles) {
            animes.addAll(article.getElementsByTag("a"));
        }
        return animes;
    }
}
