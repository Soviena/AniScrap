import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    // public static void main(String[] args) {
    //     String[] eplist = {
    //         "e1","e2","e3"
    //     };
    //     String literalArray = "[";
    //     for (String string : eplist) {
    //         literalArray += "\""+string+"\""+",";
    //     }
    //     literalArray = literalArray.substring(0, literalArray.length() - 1);
    //     literalArray += "]";
    //     System.out.println(literalArray);
    // }

    // public static void main(String[] args) {
    //     Date now = new Date();
    //     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    //     System.out.println(formatter.format(now));
    // }

    public static void main(String[] args) {
        Anime[] animes = dbqueryMaker.getSql();
        for (Anime anime : animes) {
            System.out.println(anime.getId());
        }
    }
}
