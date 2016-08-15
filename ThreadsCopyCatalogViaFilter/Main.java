
import java.io.File;
import java.io.IOException;

public class Main {
	static File folderToMonitor = new File("C:/Users/mmurza.VTV/Desktop/Private/TestDestination/");
public static void main(String[] args) throws InterruptedException {
//	try {
//CatalogOperation.catalogCopy("C:/Users/mmurza.VTV/Desktop/Private/TestSource","C:/Users/mmurza.VTV/Desktop/Private/TestDestination/", "zip", "doc");
//	}
//	catch (IOException e){
//		System.out.println(e);
//	}
	Thread monitor = new Thread (new CatalogMonitor(folderToMonitor));
	monitor.join();
	}
}