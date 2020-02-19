package com.hcl.function.ex;

import java.util.function.Function;

public class FunctionEx1 {

	
	
	public static void main(String[] args) {
		Function<String, Integer> getLength = S ->S.length();
		System.out.println(getLength.apply("Hello World!!"));
		

	}

}
