package com.hcl.predicate.ex1;

import java.util.function.Predicate;

public class PredicateEx5 {

	public static void main(String[] args) {
		
		
		Predicate<String> P = S -> S.length()>5;
		System.out.println(P.test("Hello"));
		System.out.println(P.test("ABCDEF"));

	}

}
