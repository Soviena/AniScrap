import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Website {
    private String url;
    private String name;
    public Website(String url, String name){
        this.url = url;
        this.name = name;
    }    
}

// def selectMirror(epUrl:str)->str:
//     r = scraper.parse_web(epUrl)
//     print(r)
//     videoServer = r.find('select', class_="mirror").findAll('option')
//     for i in range(1,len(videoServer)):
//         print("[{}] ".format(i)+videoServer[i].text)
//     x = int(input("Pilih source : "))
//     return re.findall(r'src="(.*?)"', scraper.decode_base64(videoServer[x]['value']))[0]
