import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        
    }

    public static void searchAnime() {
        Scanner input= new Scanner(System.in); 
        System.out.print("Cari Anime : "); String query = input.nextLine();
        input.close();
    }

}
