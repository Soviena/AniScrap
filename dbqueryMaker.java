import java.util.Date;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class dbqueryMaker {
    public static Anime[] getSql(){
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anime_history?" +
                                   "user=root&password=");
            if (conn == null) {
                System.out.println("Failed to connect database");
            }
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, title, link, eps, lastwatch, JSON_EXTRACT(eplist,'$[*]') as eplist FROM anime");
            String eps = "";
            String[] epslist;
            List<Anime> animes = new ArrayList<Anime>();
            while (rs.next()) {
                eps = rs.getString("eplist");
                eps = eps.replace("[", "").replace("]", "").replace("\"", "").replace(" ", "");
                epslist = eps.split(",");
                animes.add(new Anime(rs.getString("id"),rs.getString("title"),rs.getString("link"),epslist,rs.getInt("eps"), rs.getDate("lastwatch").toString()));
            }
            Anime[] arrayofAnime = new Anime[animes.size()];
            for (int j = 0; j < animes.size(); j++) {
                arrayofAnime[j] = animes.get(j);
            }
            // while (rs.next()) {
            //     list_pegawai.add(new Pegawai(rs.getInt("id"),rs.getString("nama"),rs.getString("posisi"),rs.getDate("tgl_lahir").toLocalDate()));
            // }
            // Pegawai[] pegawai = new Pegawai[list_pegawai.size()];
            // for(int i=0; i<list_pegawai.size(); i++){
            //     System.out.println(list_pegawai.get(i));
            //     pegawai[i] = list_pegawai.get(i);
            // }
            // jlist_pegawai.setListData(pegawai);
            conn.close();
            return arrayofAnime;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        } catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

    public static void insertSql(String id, String title, String link, String sinopsis, String eplist, String datenow, int eps){
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anime_history?" +
                                   "user=root&password=");
            if (conn != null) {
                System.out.println("Connected");
            }
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM anime WHERE id LIKE '"+id+"'");
            if (rs.next()){
                stmt.executeUpdate("UPDATE `anime` SET `eplist`='"+eplist+"', `lastwatch`='"+datenow+"', `eps`="+String.valueOf(eps)+" WHERE `id`='"+id+"';");
            }else{
                stmt.executeUpdate("INSERT INTO `anime` (`id`, `title`, `link`, `sinopsis`, `eplist`, `lastwatch`, `eps`) VALUES ('"+id+"', '"+title+"','"+link+"' ,'"+sinopsis+"' , '"+eplist+"', '"+datenow+"',"+String.valueOf(eps)+");");            
            }
            // ResultSet rs = stmt.executeQuery("SELECT * FROM pegawai");
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static void deleteSql(String id){
        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/anime_history?" +
                                   "user=root&password=");
            if (conn != null) {
                System.out.println("Connected");
            }
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM `anime` WHERE `id`='"+id+"';");
            // ResultSet rs = stmt.executeQuery("SELECT * FROM pegawai");
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static String arrayToString(String[] eplist){
        String literalArray = "[";
        for (String string : eplist) {
            literalArray += "\""+string+"\""+",";
        }
        literalArray = literalArray.substring(0, literalArray.length() - 1);
        literalArray += "]";
        return literalArray;
    }
}
