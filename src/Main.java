import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Javaのスクレイピングプログラムのサンプル
 * 
 * @author user
 *
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            Document doc = Jsoup.connect(
                    "https://www.dmm.com/mono/hobby/-/list/=/article=keyword/id=15344/list_type=reserve/n1=DgRJTglEBQ4GwJ2dwJOxkog_/sort=date/view=text/")
                    .get();
            
            Elements elements = doc.select("a");
            
            for (Element element : elements) {
                if ((element.attributes().hasKey("href")) && (element.attributes().size() == 1)) {
                    
                    String temp = element.attributes().get("href");
                    
                    if (!temp.startsWith("https://www.dmm.com/mono/hobby")) {
                        continue;
                    }
                    
                    String tmp2 = element.childNodes().get(0).toString();
                    System.out.println(tmp2);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
