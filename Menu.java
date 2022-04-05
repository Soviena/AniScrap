import java.util.Scanner;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class Menu {
    public static void mainMenu() {
        
    }

    public static void searchAnime(Website web) {
        Scanner input= new Scanner(System.in); 
        System.out.print("Cari Anime : "); String query = input.nextLine();
        Elements animes = web.searchAnime(query);
        int i = 1;
        for (Element anime : animes) {
            System.out.printf("[%d] %s\n",i,anime.attr("title").replaceAll("Nonton anime ", ""));
            i++;
        }
        input.close();
    }

}
