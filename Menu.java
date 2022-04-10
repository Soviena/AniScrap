import java.util.Scanner;

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

    public static Anime searchAnime(Website web) {
        Scanner input= new Scanner(System.in); 
        System.out.print("Cari Anime : "); String query = input.nextLine();
        Anime[] animes = web.searchAnime(query);
        int i = 1;
        for (Anime anime : animes) {
            System.out.printf("[%d] %s\n",i,anime.getTitle().replaceAll("Nonton anime ", "").replaceAll("Sub Indo", ""));
            i++;
        }
        System.out.print("\nPilih Anime : "); i = Integer.valueOf(input.nextLine());
        Anime anime = web.getAnimeDetails(animes[i-1]);
        anime = web.getEpList(anime);
        return anime;
    }

}
