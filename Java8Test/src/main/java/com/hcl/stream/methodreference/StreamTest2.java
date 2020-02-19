package com.hcl.stream.methodreference;

import java.util.function.Function;
import java.util.function.Predicate;

public class StreamTest2 {

	public static void main(String[] args) {
		Function<String, String> fn = (s) -> s.toUpperCase();
		System.out.println(fn.apply("Java8"));

		Function<String, String> fn1 = String::toUpperCase;
		System.out.println(fn1.apply("Java8"));

		//durga classes
		//subrmaniyam from youtube
	}

}
