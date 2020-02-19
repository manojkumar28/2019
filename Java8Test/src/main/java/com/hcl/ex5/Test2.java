package com.hcl.ex5;

public class Test2 {

	public static void main(String[] args) {
		MyInterface2 test =Integer::sum; //method reference
		System.out.println(test.addition(2, 5));
	}

}
