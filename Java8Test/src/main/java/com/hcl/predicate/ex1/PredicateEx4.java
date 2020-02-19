package com.hcl.predicate.ex1;

import java.util.function.Predicate;

public class PredicateEx4 {

	public static void main(String[] args) {
		
		
		Predicate<Integer> P1 = I->I>10;
		Predicate<Integer> P2 =I -> I %2==0;
		Predicate<Integer> P3 =P1.and(P2);
		
		
		
		System.out.println(P3.test(12));
		System.out.println(P3.test(13));

	}

}
