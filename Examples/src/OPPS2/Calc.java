package OPPS2;

public class Calc {
	int x;
	int y;
	
	Calc(){
		this.x = 10;
		this.y = 20;
		System.out.println("Calc Constructor is executed.");
	}
	
	
	Calc(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Constructor is executed");
	}
	
	
	void add() {
		System.out.println("Add: " + (x+y));
	}
	
	void sub() {
		System.out.println("Sub: " + (x-y));
	}
	
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.add();
		obj.sub();
		
		Calc obj1 = new Calc(50, 100);
		obj1.add();
		obj1.sub();
		obj.add();
		
	}

}
