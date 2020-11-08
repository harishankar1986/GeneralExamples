package oopsConcepts;

public class C1 {
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println("Add int, int in c1 class: " + z);
	}
	
	static void add(int x, double y) {
		double z = x + y;
		System.out.println("Add int, double in c1 class: " + z);
	}
	
	private void add(int x, int y, int k) {
		int z = x + y + k;
		System.out.println("Add int, int, int in c1 class: " + z);
	}
	
	int sub(int x , int y) {
		int z = x - y;
		System.out.println("Sub int, int in c1 class: " + z);
		return z;
	}
	
	public static void main(String[] args) {
		
		C1 l = new C1();
		l.add(10, 12);
		l.add(12, 13);
		l.add(11, 12,13);
		l.sub(12, 8);
		
	}
}
