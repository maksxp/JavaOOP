import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String content = GetHTMLCodeFromURL.getContent("https://prog.kiev.ua/forum/index.php/topic,2351.120.html");
ArrayList<String> target=GetLinksFromString.getLinks(content);
try {
	LinksToFile.save("C:/Users/mmurza.VTV/Desktop/Private/TestDestination/links.txt", target);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
