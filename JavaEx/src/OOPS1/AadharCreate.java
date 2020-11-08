package OOPS1;

public class AadharCreate {
	
	void create() {
		
	}
	
	void edit() {
		
	}
	
	void delete() {
		
	}
	
	public static void main(String[] args) {
		
		AadharCard c1 = new AadharCard();
			c1.setName("Kumar");
			c1.setAge(20);
			c1.setAddress("Narsapur");
			
			String name = c1.getName();
			int age = c1.getAge();
			String address = c1.getAddress();
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
	
	
	}
	
}
