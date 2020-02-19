package com.hcl.predicate.ex1;

import java.util.function.Predicate;

public class PredicateEx2 {

	public static void main(String[] args) {
		
		
		Predicate<String> P = S -> S.length()>5;
		System.out.println(P.test("Hello"));
		System.out.println(P.test("ABCDEF"));
		
		Predicate<String> P2 = S -> S.startsWith("K");

	}

}
