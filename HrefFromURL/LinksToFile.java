import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LinksToFile {
	public static void save(String fileName, ArrayList<String> input) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
	    for (String string : input) {
		       pw.println(string);
	    }
	    pw.close();
	System.out.println("mission completed");
	}
}
