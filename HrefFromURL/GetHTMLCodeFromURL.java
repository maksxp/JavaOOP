import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetHTMLCodeFromURL {
	private static  String text ="";
	
	public static String getContent (String address){
    try{
    URL url = new URL(address);
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
    //Map<String, List<String>> mapAnswer = httpCon.getHeaderFields();
  // mapAnswer.forEach((key,value) -> System.out.println(key+"-> "+ value));
    System.out.println();
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
   
    for (;(text=br.readLine())!=null;){
    	sb.append(text).append(System.lineSeparator());
        }
   text=sb.toString();
           }
    catch (IOException e){
    	System.out.println(e);
    }
	return text;
    	}
	
}