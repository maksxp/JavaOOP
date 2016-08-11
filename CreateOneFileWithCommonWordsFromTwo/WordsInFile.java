//import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsInFile {
public static List <String> getWordsFromOneFile (String source) {
	if (source==null){
		throw new IllegalArgumentException("Null pointer to file extention");
	}
	List <String> wordList = new ArrayList<String>(); 
	String str="";
	try (BufferedReader bufreader = new BufferedReader (new FileReader(source));){
		for(;(str=bufreader.readLine())!=null;){
			String [] tokens = str.split("\\s+");
			List<String> wordListTemp = new ArrayList<String>(Arrays.asList(tokens));
			wordList.addAll(wordListTemp);
			}
		 
	}
	catch (FileNotFoundException e){
		System.out.println(e);
	}
	catch (IOException e){
		System.out.println(e);
	}
	return wordList;
}
public static List<String> getCommonWordsFromArrayOfFiles (String ... source){
	if (source==null){
		throw new IllegalArgumentException("Null pointer to file extention");
	}
	String[] allFilesToGetWords = source;
	List <String> wordsListFinal = new ArrayList<String>(); 
	wordsListFinal.addAll(getWordsFromOneFile(source[0]));// do it for use retainAll method
		for (int i=1; i<allFilesToGetWords.length;i++) {
			List <String> wordsListTemp = new ArrayList<String>(); 
		wordsListTemp.addAll(getWordsFromOneFile(allFilesToGetWords[i]));
		wordsListFinal.retainAll(wordsListTemp);
		//System.out.println(wordsSetTemp);
		}
	//System.out.println(wordsSetFinal);
	return wordsListFinal;
}
//can combine any files you want
public static File createFileWithCommonWords (String destination, String ... source) throws IOException{
	if (destination==null){//destination is address of file with common words
		throw new IllegalArgumentException("Null pointer to final file");
	} 
	File fileFinal = new File (destination);
	fileFinal.createNewFile();//create file to write words
	Path pathToFinal = FileSystems.getDefault().getPath(destination);
    Files.write(pathToFinal,getCommonWordsFromArrayOfFiles(source));
	return fileFinal;
}
}
