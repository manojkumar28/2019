package com.hcl.function.ex;

import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {
		 BiFunction<Integer,Integer,Integer> f=(a,b)->a*b; 
		 System.out.println(f.apply(10,20));
		 System.out.println(f.apply(100,200)); 

	}

}
