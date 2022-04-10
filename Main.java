import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Website anoboy = new Website("https://anoboy.online");
        anoboy.setSearchUrl("/search/");
        String x = "0";
        while (x != "x") {
            x = Menu.mainMenu();
            switch (x) {
                case "s":
                    Anime anime = Menu.searchAnime(anoboy);
                    Integer y;                    
                    System.out.println("Sinopsis :\n");
                    System.out.println(anime.getDesc());
                    System.out.print("\nPilih episode [ 1 - "+String.valueOf(anime.getEpList().length)+" ] : "); y = Integer.valueOf(input.nextLine());
                    System.out.println(anime.getEpList()[y-1]);
                    break;
                case "b":
                    // goto b
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