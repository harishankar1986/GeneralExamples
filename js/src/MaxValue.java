// Import the class for the user assigned values
import java.util.Scanner;

// If-else
public class MaxValue {

	public static void main(String[] args) {
		// Input the value by User
		// Scanner class is used for the input value 
		Scanner input = new Scanner(System.in);
		
		//Input of the First Number
			System.out.print("Enter First Number: ");	// Display the Output
			int x = input.nextInt();	// Assigning the First Value.
			
		// Input of the Second Number
			System.out.print("Enter Second Number: ");	//Display the output
			int y = input.nextInt();	// Assigning the second Value.
			
		// Input of the Third Number	
			System.out.print("Enter Third Number: ");	//Display the output
			int  z = input.nextInt();	// Assigning the Third Value
		
		if (x>y && x>z)	// Condition of max value as x
			System.out.println(x +" is greater");	// Display the output if x is max
		
		else if(y>x && y>z)	// Condition of max value as y
			System.out.println(y + " is greater");	// Display the output if y is max
		
		else if(z>x && z>y)	// Condition of max value as z
			System.out.println(z + " is greater");	// Display the output if z is max
		
		else	// If above Condition are failed
			System.out.println("there is two or more same "); // Display the output 

	}

}
