import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("https://java-skill.com/").get();

            Elements elements = doc.select("h3");

            for (Element element : elements){
                System.out.println(element);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
}
