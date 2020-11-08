package OOPS1;

public class StudentReg {

		String name;
		int age;
		static String school = "Narayana school";
		
		void register() {
			System.out.println("student registered successfully");
		}
		
		void delete() {
			System.out.println("Student delete successfully");
		}
		
		public static void main(String[] args) {
			
			StudentReg st1 = new StudentReg();
			StudentReg st2 = new StudentReg();
			
		//	System.out.println(school);
		//	System.out.println(st1.age); // Non-static to static reference is needed
		//	st1.register();
			
			st1.name = "Suresh";
			st1.age = 15;
			st1.register();
			
			st2.name = "John";
			st2.age = 13;
			st2.register();
			
			System.out.println(st1.name);
			System.out.println(st1.age);
			System.out.println(school);
			System.out.println(StudentReg.school);
			System.out.println(st1.school); // if there is no data it takes reference from class
			
			st1.school = "Chitanya School";

			System.out.println(st2.name);
			System.out.println(st2.age);
			
			System.out.println(school);
			System.out.println(StudentReg.school);
			System.out.println(st1.school);
			System.out.println(st2.school);
			
			// 
			
		}
		
}
