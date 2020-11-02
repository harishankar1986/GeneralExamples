
public class ReverseNumber {

		public static void main(String[] args) {
			int reverse = 0;
			int remainder = 0;
			int number = 100;
			
			while (number >= 1) {
			remainder = number % 10;	// 3 - Remainder
			reverse = reverse * 10 + remainder; // 0 * 10 + 3
			number = number / 10; // 15 - Number
		}
			System.out.println(reverse);
	
		/*	
			String name = "001";
			int leng = name.length();
			String rev = "";
			
			for (int i = leng - 1; i >= 0; i--) {
				rev = rev + name.charAt(i);
			}
			System.out.println(rev);
		*/
		}
}
