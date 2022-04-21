public class AnoboyLive extends Website{
    public AnoboyLive(){
        super("https://anoboy.live/", "Anoboy.Live");
    }



    // public void setSearchUrl(String slug) {
    //     this.searchUrl = this.url+slug;
    // }

    // public Anime[] searchAnime(String query) {
    //     // System.out.println(page);
    //     Elements articles = Scrapper.parseWeb(this.searchUrl+query).getElementsByClass("inf");
    //     Elements rawAnimes = new Elements();
    //     Anime[] animes = new Anime[articles.size()];
    //     int i = 0;
    //     for (Element article : articles) {
    //         rawAnimes.addAll(article.getElementsByTag("a"));
    //     }
    //     for (Element anime : rawAnimes) {
    //         animes[i] = new Anime(anime.attr("title"),anime.attr("href"));
    //         i++;
    //     }
    //     return animes;
    // }

    // public Anime getAnimeDetails(Anime anime){
    //     anime.setDesc(Scrapper.parseWeb(anime.getLink()).getElementsByClass("entry-content").first().text());
    //     return anime;
    // }

    // public Anime getEpList(Anime anime){
    //     Elements listOfEp = Scrapper.parseWeb(anime.getLink()).getElementsByClass("eplister").first().getElementsByTag("a");
    //     String[] eps = new String[listOfEp.size()];
    //     int i = 0;
    //     for (Element ep: listOfEp) {
    //         eps[i] = ep.attr("href");
    //         i++;
    //     }
    //     anime.setEpList(eps);
    //     return anime;
    // }

    // public String selectMirror(String eplink){
    //     Scanner inp = new Scanner(System.in);
    //     Elements vidServer = Scrapper.parseWeb(eplink).getElementsByClass("mirror").first().getElementsByTag("option");
    //     for (int i = 1; i < vidServer.size(); i++) {
    //         System.out.printf("[%d] %s\n",i,vidServer.get(i).text());            
    //     }
    //     System.out.print("Pilih Source : "); int x = Integer.valueOf(inp.nextLine());
    //     String rawlink = vidServer.get(x).attr("value");
    //     String link = Scrapper.decodeBase64(rawlink);
    //     Pattern srcpat = Pattern.compile("src=\"(.*?)\"");
    //     Matcher srcmat = srcpat.matcher(link);
    //     srcmat.find();
    //     return srcmat.group(1);
    // }    
}
