package oopsConcepts;

public class CreateAadhar {

	void create() {
		
	}
	
	void edit() {
		
	}
	
	void delete() {
		
	}
	
	public static void main(String[] args) {
		
		//creating object with reference to class
		AadharDetails ad = new AadharDetails(); 
		
		//calling from other class which is private accessor
		ad.setAadhar("4995 7932 0473"); 
		ad.setName("Ramesh"); 
		
		// calling with reference to class
		ad.age = 28; 
		ad.address = "Vijayawada";	
		
		AadharDetails da = new AadharDetails();
		da.setAadhar("7932 4856 6985");
		da.setName("Rajesh");
		da.age = 48;
		da.address = "Hyderabad";
		
		// using getters for getting value of private from other class
		String aadharNo = ad.getAadhar();
		String name = ad.getName();
		
		//calling with reference to class
		String aadhar2 = da.getAadhar();
		String name2 = da.getName();
		
		//output statement
		System.out.println("Aadhar No: " + aadharNo);
		System.out.println("Name	 : " + name);
		System.out.println("Age	 : " +ad.age);
		System.out.println("Address	 : " + ad.address);
		
		System.out.println("\n *******************\n");
		
		System.out.println("Aadhar No: " + aadhar2);
		System.out.println("Name     : " + name2);
		System.out.println("Age      : " + da.age);
		System.out.println("Address  : " + da.address);
	}
}
