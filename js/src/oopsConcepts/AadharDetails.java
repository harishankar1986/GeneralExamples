package oopsConcepts;

public class AadharDetails {
	
	private String aadharNo;
	private String name;
	int age;
	String address;

	public void setAadhar(String aadharNo) {
		this.aadharNo = aadharNo; // method calling from class
	}

	public void setName(String name) {
		this.name = name; // method calling from class
	}
	
	public String getAadhar() {
		return aadharNo;	// return variable from class
	}
	
	public String getName() {
		return name; // return variable from class
	}
	
}
