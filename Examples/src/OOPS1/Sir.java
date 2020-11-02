package OOPS1;

public class Sir {

	private void m1() {
		System.out.println("m1 executed.");
	}
	
	void m2() {
		System.out.println("m2 executed.");
	}
	
	protected  void m3() {
		System.out.println("m3 executed.");
	}
	
	public void m4() {
		System.out.println("m4 executed.");
	}
	
	
	public static void main(String[] args) {
		
		Sir s = new Sir(); // All  modifiers will access in the same class 
	}
}
