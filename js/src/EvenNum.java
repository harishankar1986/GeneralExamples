import java.util.Scanner;

public class EvenNum {
	
	public static void main(String[] args) {
		
		// Finding the Even or Odd number by User define
		
	/*	Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number: ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) 
			System.out.println(num + " is a Even number.");
			
		else
			System.out.println(num + " is a Odd number.");
	*/	
		
		// Displaying the even number in between 1 - 50
		
	/*	int a;
		int num = 50;
		
		for(a = 1; a <= num; a++)
		if(a % 2 == 0) {
			System.out.print( " " + a);
		}
	*/	
		
		// Displaying the even number by using while loop
		
		int a = 2;
		
		while (a <= 50) {
			System.out.print(a + " ");
			a +=2;
		}
	}
}
