package oopsConcepts;

import OOPS1.Sir;

public class Sir2 extends Sir {

	public static void main(String[] args) {
		Sir2 s2 = new Sir2(); // protected assess in another package with condition. protected accessed with the child derived class 
		
		
		Sir s3 = new Sir();
		s3.m4();	// public will access at everywhere in the project
		
	}
}
