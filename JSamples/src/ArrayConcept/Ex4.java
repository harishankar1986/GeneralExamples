package ArrayConcept;

// Display the position of value in array

public class Ex4 {

	public static void main(String[] args) {
		
		int[][] a = new int[2][2];
		
		a[0][0] = 10;
		a[0][1] = 15;
		a[1][0] = 20;
		a[1][1] = 30;
		
		System.out.println(a[1][0]);
		
		int [][] b = {{20,5},{30,7},{40,9}};
		
		System.out.println(b[2][1]);
		
		int [][] c = {
						{20,5},
						{30,7},
						{40,9}
					};
		System.out.println(c[1][0]);
	}
		
	}

