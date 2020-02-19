package com.hcl.predicate.ex1;

import java.util.function.Predicate;

public class PredicateEx1 {

	public static void main(String[] args) {
		/*Predicate<Integer> P = new Predicate<Integer>() {
			@Override
			public boolean test(Integer I) {
			
				return I>10;
			}
		};*/
		
		/*Predicate<Integer> P = new Predicate<Integer>() {
		@Override
		public boolean test(Integer I) {
			return I>10;
		}
		};*/
		
		Predicate<Integer> P = I-> I>10;

		
		System.out.println(P.test(11));
		;
	}

}
