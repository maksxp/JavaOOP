import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GetLinksFromString {
	private static ArrayList<String> target=new ArrayList<>();
	
	public static ArrayList<String> getLinks (String content){
		Pattern pHref = Pattern.compile("href=\"(.+?)\"");
		Pattern pSrc = Pattern.compile("src=\"(.+?)\"");
		Matcher matcherHref = pHref.matcher(content);
		Matcher matcherSrc = pSrc.matcher(content);
		while (matcherHref.find()){
			target.add(matcherHref.group(1));
		}
		while (matcherSrc.find()){
			target.add(matcherSrc.group(1));
		}
		List <String> list = target.stream().filter(line -> line.contains("http")).collect(Collectors.toList());
		return target=(ArrayList<String>) list;
	}

}
