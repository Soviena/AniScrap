import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void selectEpisode(Anime anime, Website web){
        Scanner input = new Scanner(System.in);
        int y;
        System.out.println("Sinopsis :\n");
        System.out.println(anime.getDesc());
        System.out.print("\nPilih episode [ 1 - "+String.valueOf(anime.getEpList().length)+" ] : "); y = Integer.valueOf(input.nextLine());
        String link = web.selectMirror(anime.getEpList()[anime.getEpList().length-y]);
        link = Scrapper.uservideo(link);
        try {
            Process prc = Runtime.getRuntime().exec("mpv "+link);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Website anoboy = new Website("https://anoboy.online");
        anoboy.setSearchUrl("/search/");
        String x = "0";
        Anime anime;
        while (x != "x") {
            x = Menu.mainMenu();
            switch (x) {
                case "s":
                    anime = Menu.searchAnime(anoboy);                    
                    selectEpisode(anime, anoboy);
                    break;
                case "a":
                    anime = Menu.recentUpload(anoboy);
                    selectEpisode(anime, anoboy);
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak Valid");
                    break;
            }
        }
    }
}