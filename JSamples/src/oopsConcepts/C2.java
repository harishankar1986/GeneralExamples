package oopsConcepts;

public class C2 extends C1{
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println("Add int, int in C2 class: " + z);
	}
	
	void add(double x, double y) {
		double z = x + y;
		System.out.println("Add double, double in C2 class: " + z);
	}
	
	void mul(int x, int y) {
		int z = x * y;
		System.out.println("Mul int, int in C2 class: " + z);
	}
	
	public static void main(String[] args) {
		C2 s = new C2();
		add(12,13.55);
		s.add(12, 15);
		s.sub(12, 16);
	
	}
}
