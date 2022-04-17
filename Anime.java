public class Anime {
    private String title;
    private String link;
    private String thumbLink;
    private String desc;
    private String[] eplist;

    public Anime(String title, String link, String thumblink){
        setTitle(title);
        setLink(link);
        setThumbLink(thumblink);
    }
    public Anime(String title, String link){
        setTitle(title);
        setLink(link);
    }
    public Anime() {
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLink(String link){
        this.link = link;
    }
    public void setThumbLink(String link){
        this.thumbLink = link;
    }
    public void setEpList(String[] link){
        this.eplist = link;
    }

    public String getDesc(){
        return this.desc;
    }
    public String getTitle() {
        return this.title;
    }
    public String getLink(){
        return this.link;
    }
    public String getThumbLink(){
        return this.thumbLink;
    }
    public String[] getEpList(){
        return this.eplist;
    }
}
