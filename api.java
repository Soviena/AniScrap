import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public interface api {
    // Keyword = load_movie_last_update
    // Keyword = load_movie_trending
    // Keyword = load_search_movie
    public JSONObject query(String keyword, boolean ongoing, String query, int page, int limit);
    public JSONObject query(String keyword, boolean ongoing, String query, int page);
    public JSONObject query(String keyword, boolean ongoing, String query);
    public JSONObject query(String keyword, boolean ongoing);
    public JSONObject query(String keyword);
}
