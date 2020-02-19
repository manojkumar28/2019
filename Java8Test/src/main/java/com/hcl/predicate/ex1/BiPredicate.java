package com.hcl.predicate.ex1;

public class BiPredicate {

	public static void main(String[] args) {
		 java.util.function.BiPredicate<Integer,Integer> p=(a,b)->(a+b) %2==0;  
		          System.out.println(p.test(10,20));  
		          System.out.println(p.test(15,20));   

	}

}
