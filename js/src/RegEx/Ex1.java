package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		
		String source = "hari.vanka@gmail.com , ramesh.sa123@gmail.com , balu.v.143@gmail.com ";
		
		String pattern = "[a-z]*\\.[a-z]*\\@gmail\\.com";
		
		validateRegEx (source, pattern);
	}
	public static void validateRegEx (String source , String pattern) {
		boolean flag = false;
		Pattern ptrn = Pattern.compile(pattern);
		
		Matcher matches = ptrn.matcher(source);
		
		while (matches.find()) {
			
			System.out.println(matches.group());
			flag = true;
		}
	
		if (flag != true) {
			System.out.println("Match not found");
		}
		
	}
}
