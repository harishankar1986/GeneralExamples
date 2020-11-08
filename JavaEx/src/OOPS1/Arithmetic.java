package OOPS1;

public class Arithmetic {

	void add(int x, int y) {
		int z = x + y;
		System.out.println("Add: " + z);
	}
	
	int mul(int x, int y) {
		int  z = x * y;
		return z;
	}
	
	public static void main(String[] args) {
		
		Arithmetic obj = new Arithmetic();
		obj.add(20, 50);
		int z = obj.mul(5, 6);
			System.out.println("Mul: " +z);
	}
}
