
public class Fibonacci {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		int n =10;
		
		for(int i = 0; i < n; i++) {
			c = a + b;
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
		}
}
