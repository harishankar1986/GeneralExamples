package ArrayConcept;

public class Arrays_Ex4 {

	public static void main(String[] args) {
		
		int [] A = {10, 12, 15, 48};
		int [] B = new int [4];
		
		for (int i = 0; i < A.length; i++)
			B[i] = A[i];
		
		for (int i = 0; i < B.length; i++)
			System.out.println(B[i]);
	}
}
