import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
File result=null;
try {
	result=WordsInFile.createFileWithCommonWords ("C:/Users/mmurza.VTV/Desktop/Private/TestSource/result.txt","C:/Users/mmurza.VTV/Desktop/Private/TestSource/test1.txt","C:/Users/mmurza.VTV/Desktop/Private/TestSource/test2.txt","C:/Users/mmurza.VTV/Desktop/Private/TestSource/test3.txt");
} catch (IOException e) {
	System.out.println(e);
}
System.out.println(WordsInFile.getWordsFromOneFile((result.getAbsolutePath())));
	}
}
