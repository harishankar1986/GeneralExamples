package OOPS1;

public class Calculator {
	
	int x;
	int y;
	int z;
	
	public void add() {
		int z;
		z = x+y;
		System.out.println("Add : " + z);
		System.out.println("output of z is: " + this.z);
	}
	
	public void mul() {
		z= x * y;
		System.out.println("Mul : " + z);
	}
	
	public void sub() {
		z = x - y;
		System.out.println("Sub : " + z);
	}

	

	public void div() {
		System.out.println("Div : " + (x/y));
	}
	
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		obj1.x = 20;
		obj1.y = 10;
		obj1.add();
		obj1.sub();
		obj1.mul();
		
		obj1.div();
		
		
		obj1.x = 200;
		obj1.y = 100;
		obj1.add();
		
	}

}
