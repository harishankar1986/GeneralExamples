package ExceptionHandling;

public class Ex3 {

	public static void main(String[] args) {
		try {
			int a = 15;
			int b = 0;
		
			if (b == 0) {
				throw new ArithmeticException("cannot divide by zero");
			}
			else {
				int c = a/b;
				System.out.println("Output is: " + c);
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("can't divide by zero");
		}
	}
}
