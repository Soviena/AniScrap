
public class Main {

    public static void main(String[] args) {
        Website anoboy = new Website("https://anoboy.online");
        anoboy.setSearchUrl("/search/");
        String x = "0";
        while (x != "x") {
            x = Menu.mainMenu();
            switch (x) {
                case "s":
                    System.out.println(Menu.searchAnime(anoboy));
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