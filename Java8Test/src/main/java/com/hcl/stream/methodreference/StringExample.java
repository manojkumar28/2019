package com.hcl.stream.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Adam", "Jenny", "Emily", "Dave", "Sophia", "James");

		// From Given a list of String( Names), print the names in Upper Case.
		nameList.stream().map(String::toUpperCase).peek(System.out::println).count();
		
		// From Given a list of String( Names), sort the names based on their length and stored into List.
		List<String> nms=nameList.stream().sorted(Comparator.comparing(String::length)).peek(System.out::println).collect(Collectors.toList());
		System.out.println(nms);
			
		// From Given a list of String( Names), sort the names based on their length in descending order and stored into List.
		List<String> nms1=nameList.stream().sorted(Comparator.comparing(String::length).reversed()).peek(System.out::println).collect(Collectors.toList());
		System.out.println(nms1);
		
		// From Given a list of String( Names), sort the names in descending order(alphanumeric) and print them.
		List<String> nms2=nameList.stream().sorted().peek(System.out::println).collect(Collectors.toList());
		System.out.println(nms2);
		
		// From Given a list of String( Names), sort the names in descending order(alphanumeric), print them and stored them into list.
		List<String> nms3=nameList.stream().sorted(Comparator.reverseOrder()).peek(System.out::println).collect(Collectors.toList());
		System.out.println(nms3);
	
	}

}
