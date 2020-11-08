package ExceptionHandling;



public class Ex1 {

	static void div(int den) {
		try {
			double s = 50/den;
			
			System.out.println("Total : " + s);
		}
		catch (Exception e) {
			e.printStackTrace();	// to display exception details in console
			// System.out.println(e.getMessage()); // to get pre defined msg.
		}
	}
	
	public static void main(String[] args) {
		
		int	arr[] = {4, 5, 6, 0, 8, 4};
		
		for(int i = 0; i < arr.length; i++) {
			div(arr[i]);
		}
	}


}
