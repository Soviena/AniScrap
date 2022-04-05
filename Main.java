
public class Main {

    public static void main(String[] args) {
        Website anoboy = new Website("https://anoboy.online");
        anoboy.setSearchUrl("/search/");
        Menu.searchAnime(anoboy);

    }
}