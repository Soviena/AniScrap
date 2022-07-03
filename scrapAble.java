public interface scrapAble {

    public void setSearchUrl(String slug);
    public Anime[] searchAnime(String query);
    public void getAnimeDetails(Anime anime);
    public void getEpList(Anime anime);
    public String selectMirror(String eplink);
}
