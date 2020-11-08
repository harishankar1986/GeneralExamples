
public class DisplayPrime {

	public static void main(String[] args) {
		
		/*for (int n = 2; n <= 50; n++) {
			
			int cnt = 0;
			
			for(int i = 2; i <=n/2; i ++) {
				if (n % i ==0) {
					cnt++;
				}	
			}
			if (cnt == 0)
			System.out.println(n);
		}*/
		
	
		
		int i = 0;
		int num = 0;
		
		String primeNumbers = "";
		
		for ( i = 1; i <= 50; i++) {
			int cnt = 0;
			for ( num = i; num >= i; num--) {
				
				if (i % num == 0)
					cnt += 1;
			}
			if (cnt == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
			System.out.println(primeNumbers);
		}
		
	}

}
