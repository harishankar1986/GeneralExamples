
public class DisplayDemo {

	public static void main(String[] args) {
		
		for(int n=2; n<=50; n++) {
			int cnt = 0;
			for(int i=2; i<=n/2; i++) {
				if(n%i == 0) {
					cnt++;
				}
			}
			if(cnt == 0)
				System.out.print(n+" ");
		}

	}

}
