package RegEx;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "Testing Masters";
		int s1 = s.length()-1;
		String str = "";
		
		for (int i = s1; i >= 0; i--) {
			str = str + s.charAt(i);
		}
		System.out.println(str);
		
	}
}
