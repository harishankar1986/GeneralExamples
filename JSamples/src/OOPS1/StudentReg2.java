package OOPS1;

public class StudentReg2 {
	
	static StudentReg2 obj;
	String name;
	int age;
	static String school = "Rao's school";
	
	void assign1() {
		name = "Suresh";
		age = 15;
		
	}
	
	static void assign2() {
		obj = new StudentReg2();
		obj.name = "Venkat";
		obj.age = 14;
		
	}
	
	void display1() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(school);
	}
	
	static void display2() {
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(school);
	}
	
	public static void main(String[] args) {
		
	/*	assign2();
		display2();
		obj.assign1();
		obj.display1();
	*/	
		
		assign2();
		display2();
		obj.assign1();
		obj.display1();
		
		
		
		
	/*	StudentReg2 obj1 = new StudentReg2();
		obj1.assign1();
		obj1.display1();
		assign2();
		display2();
	*/
	}
	
}
