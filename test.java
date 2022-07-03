import java.util.Date;
import java.text.SimpleDateFormat;
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

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(now));
    }
}
