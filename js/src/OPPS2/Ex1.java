package OPPS2;

// Applying the constructor in the example

public class Ex1 {
	
	int x;
	int y;
	
	Ex1(){
		this.x = 10;
		this.y = 20;
	}
	
	void add() {
		System.out.println("Add: " + (x+y));
	}
	
	void sub() {
		System.out.println("Sub: " + (x-y));
	}
	
	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		obj.add();
		obj.sub();
	}
	
}
