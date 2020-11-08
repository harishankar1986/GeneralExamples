package ArrayConcept;

import java.util.Scanner;

// Display the names by giving the size of array

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		String[] names = new String[n]; 
		
		System.out.println("Enter names: ");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		System.out.println("Displaying name: ");
		for (int i = 0; i < names.length; i++ )
			System.out.println(names[i]);
		
	/*	System.out.println("Displaying name: ");
		for (String name : names)
			System.out.println(name);
	*/	
	}
	
	
}
