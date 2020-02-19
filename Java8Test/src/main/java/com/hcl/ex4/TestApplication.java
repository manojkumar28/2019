package com.hcl.ex4;


public class TestApplication {

	public static void main(String args[]) {
		
		
		
		MyInterface1 miLambda = System.out::println;
		miLambda.printHello("Tabish");
		
		
	}
	
	
}
