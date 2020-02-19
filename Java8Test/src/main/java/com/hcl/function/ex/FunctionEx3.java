package com.hcl.function.ex;

import java.util.function.Function;

public class FunctionEx3 {
	

	public static void main(String[] args) {
	
		Function<Integer, Integer> square= I->I*I;
		System.out.println(square.apply(5));
		;

	}

}
