package com.hcl.function.ex;

import java.util.function.Function;

public class FunctionEx4 {
	

	public static void main(String[] args) {
	
		Function<String, String> removeSpace= S->S.replaceAll(" ", ""); 
		System.out.println(removeSpace.apply("Hello World"));
		
		
		Function<String, Integer> countSpace= S->S.length() - S.replaceAll(" ", "").length(); 
		System.out.println(countSpace.apply("Hello World"));
		;

	}

}
