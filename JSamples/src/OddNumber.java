import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// Input Variables
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter the Number: ");
		//int num = input.nextInt();
		
		// Enter the Value from 1 - 20 and find the odd number
		//Input Variables
		int x = 20; 	//Enter the max value of the number
		int i;	//Variable without Initialization.
		
		// Applying the Loop for the Variables 
		for ( i = 1; i <= x; i++) {
			
			// Condition for Odd Number
			if (i%2 != 0) {
				System.out.print(i + " ");	//Output of the variable i....!!!
			
			}
			
		}

	}

}
