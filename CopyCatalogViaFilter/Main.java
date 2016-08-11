
import java.io.IOException;
public class Main {
public static void main(String[] args) {
	try {
CatalogOperation.catalogCopy("C:/Users/mmurza.VTV/Desktop/Private/TestSource","C:/Users/mmurza.VTV/Desktop/Private/TestDestination/", "zip", "doc");
	}
	catch (IOException e){
		System.out.println(e);
	}
	}
}