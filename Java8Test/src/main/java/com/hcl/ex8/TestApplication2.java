package com.hcl.ex8;

public class TestApplication2 implements MyInterface1{

	@Override
	public void printHello(String S) {
		System.out.println("Hello "+S);
		
	}
	
	/*public void myMethod(String S) {
		System.out.println("From subclass, Hello "+S);
	}*/
	
	public static void main (String [] args){
		TestApplication2 ob = new TestApplication2();
		ob.printHello("ABC");
		
		ob.myDefaultMethod("ABC");
	}

}
