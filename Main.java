
public class Main {

    public static void main(String[] args) {
        Website anoboy = new Website("https://anoboy.online");
        anoboy.setSearchUrl("/search/");
        String x = "0";
        while (x != "x") {
            Menu.mainMenu();
            switch (x) {
                case "a":
                    // goto a
                    break;
                case "b":
                    // goto b
                    break;
            }
        }
    }
}