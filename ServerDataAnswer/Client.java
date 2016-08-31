import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
private Socket soc;
private String ansv;
private Thread t;

public Client(Socket soc, String ansv) {
super();
this.soc = soc;
this.ansv = ansv;
t = new Thread(this);
t.start();
}
public void run() {
try (OutputStream os = soc.getOutputStream();PrintWriter pw = new PrintWriter(os)) {
String response = "HTTP/1.1 20 OK\r\n" + "Server: My_Server\r\n" + "Content-Type:text/html\r\n"+ "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
pw.print(response+ansv);
pw.flush();
} catch (IOException e) {
System.out.println(e.toString());
}
}
}