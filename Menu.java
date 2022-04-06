import java.util.Scanner;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Menu {
    public static String mainMenu() {
        Scanner input= new Scanner(System.in);
        System.out.println("\nMain Menu\n");
        System.out.println("[S] Untuk Search Anime");
        System.out.println("[H] Untuk Melihat History");
        System.out.println("[A] Untuk Melihat Upload Terbaru");
        System.out.print("[X] Untuk Keluar\n\nInput : ");
        String x = input.nextLine();
        return x.toLowerCase();
    }

    public static String searchAnime(Website web) {
        Scanner input= new Scanner(System.in); 
        System.out.print("Cari Anime : "); String query = input.nextLine();
        Elements animes = web.searchAnime(query);
        int i = 1;
        for (Element anime : animes) {
            System.out.printf("[%d] %s\n",i,anime.attr("title").replaceAll("Nonton anime ", ""));
            i++;
        }
        System.out.print("\nPilih Anime : "); i = Integer.valueOf(input.nextLine());
        return animes.get(i-1).attr("href");
    }

}
