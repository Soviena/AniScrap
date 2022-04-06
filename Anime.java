public class Anime {
    private String title;
    private int episode;
    private String link;
    private String thumbLink;

    public Anime(String title, String link, String thumblink){
        setTitle(title);
        setLink(link);
        setThumbLink(thumblink);
    }
    public Anime(String title, String link){
        setTitle(title);
        setLink(link);
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setEpisode(int eps){
        this.episode = eps;
    }
    public void setLink(String link){
        this.link = link;
    }
    public void setThumbLink(String link){
        this.thumbLink = link;
    }
    public String getTitle() {
        return this.title;
    }
    public int getEpisode(){
        return this.episode;
    }
    public String getLink(){
        return this.link;
    }
    public String getThumbLink(){
        return this.thumbLink;
    }
}
