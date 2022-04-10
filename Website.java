import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Website {
    private String url;
    private String searchUrl;
    public Website(String url){
        this.url = url;
    }
    public void setSearchUrl(String slug) {
        this.searchUrl = this.url+slug;
    }

    public Anime[] searchAnime(String query) {
        // System.out.println(page);
        Elements articles = Scrapper.parseWeb(this.searchUrl+query).getElementsByClass("inf");
        Elements rawAnimes = new Elements();
        Anime[] animes = new Anime[articles.size()];
        int i = 0;
        for (Element article : articles) {
            rawAnimes.addAll(article.getElementsByTag("a"));
        }
        for (Element anime : rawAnimes) {
            animes[i] = new Anime(anime.attr("title"),anime.attr("href"));
            i++;
        }
        return animes;
    }

    public Anime getAnimeDetails(Anime anime){
        anime.setDesc(Scrapper.parseWeb(anime.getLink()).getElementsByClass("entry-content").first().text());
        return anime;
    }

    public Anime getEpList(Anime anime){
        Elements listOfEp = Scrapper.parseWeb(anime.getLink()).getElementsByClass("eplister").first().getElementsByTag("a");
        String[] eps = new String[listOfEp.size()];
        int i = 0;
        for (Element ep: listOfEp) {
            eps[i] = ep.attr("href");
            i++;
        }
        anime.setEpList(eps);
        return anime;
    }
}
