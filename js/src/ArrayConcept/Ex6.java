package ArrayConcept;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
	
	int row, col, i ,j;
	int arr[][] = new int [10][10];
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter rows: ");
	row = sc.nextInt();
	
	System.out.println("Enter Columns: ");
	col = sc.nextInt();
	
	System.out.println("Number of rows and columns is: "+ (row*col));
	
	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			arr[i][j] = sc.nextInt();
			
		}
	}
	System.out.println("*****************");
	
	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	
	}
}
