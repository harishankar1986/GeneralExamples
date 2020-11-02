package ArrayConcept;

// Addition of 2 x 2 matrix 

public class Ex5 {

	public static void main(String[] args) {
		
		int rows = 2, cols = 2;
		int x[][] = {{5,6},{4,3}};
		int y[][] = {{2,4},{6,8}};
		
		int sum[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println("Sum of two matrix is: ");
		for(int[] row : sum) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
