import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Main {
	static int counter=1;
@SuppressWarnings("unused")
public static void main(String[] args) {
	
try (ServerSocket soc = new ServerSocket(8080)) {
for (;;) {
Socket clisoc = soc.accept();
String ansver = "";
ansver += "<html>"
		+ "<head>"
		  + "<title>answer from server</title> "
		  + "<meta charset='KOI-8R'>"
		+ "</head>"
		    + "<p align=\"center\"><body><font size=\"5\" color=\"red\" face=\"Arial\">"
		+ "<strong >Информация о системе "
		+"</font></p></strong>"
		+ "<br>";
ansver +=System.getProperties()  
+ "<br>"
+ "<br>";
ansver += "<table border='5' cellpadding='25' >"
		      + "<tr> "
	       + "<th>номер запроса</th>"
	       + "<th>";
	       ansver +=  counter++
	      + "</th>"
	       + "<tr> "
	       + "<th>время</th>"
	        + "<th>";
	       ansver += new SimpleDateFormat().getCalendar().getTime()
	      + "</th>"
	       +"</tr>"
		  +"</tr>";

ansver += "</table>"
		     + "</body>"
		+ "</html>";
Client cli = new Client(clisoc, ansver);
}
} catch (IOException e) {
System.out.println("Error to server Socket Open!!!");
}
}
}
