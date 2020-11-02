package StringDemo;

// Displaying the Strings Equals and equalsIgnoreCase and ContentEquals

public class Ex4 {

	public static void main(String[] args) {
		
		String s1 = "Hari Shankar";
		String s3 = "hari shankar";
		String s4 = "Ravi Shankar";

		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
		System.out.println(s1.contentEquals(s3));
		
		System.out.println();
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}
