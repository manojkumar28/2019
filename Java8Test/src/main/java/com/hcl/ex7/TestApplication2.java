package com.hcl.ex7;

public class TestApplication2 {
	
	public static void main(String gg[]) {
		
		MyInterface4 myInterface = str-> str.length();
		System.out.println(myInterface.printLength("Hello"));
	}

}
