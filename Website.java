

public class Website {
    private String url;

    public Website(String url){
        this.url = url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
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
