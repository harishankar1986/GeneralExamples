
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 47;
		int cnt = 0;
		
		for (int i = 2; i<=n/2; i++) {
			
			if (n%i == 0) {
			cnt++;	
			}
		}	
			if (cnt == 0)
				System.out.println(n + " is a prime number");
			
			else
				System.out.println(n + " not prime");
	}

}
