package com.java.core.fundamental.defaultmethod;

/*
 * Compile time error:
 * Duplicate default methods named log with the parameters (String) and (String) are inherited from the types Interface2 and Interface1
 */
public class Class1 implements Interface1, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	//Class1 won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.print("abc");
	}
}
