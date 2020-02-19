package com.hcl.stream.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberExample {

	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(13,7,11,12,6,4,10,20,9,5);
		
		// From Given a list of integers, filter out even numbers and print those numbers.
		integerList.stream()
				   .filter(i->i%2==0)
				   .peek(System.out::println)
				   .forEach(System.out::println);
		
		// From Given a list of integers, filter out even numbers and print the square of these numbers.
		integerList.stream()
		   .filter(i->i%2==0)
		   .map(s->s*s)
		   .forEach(System.out::println);
		
		// From Given a list of integers, filter out even numbers and greater than 9. Print the total count of those numbers.
		Long count=integerList.stream()
		   .filter(i->i%2==0 && i>9)
		   .peek(System.out::println)
		   .count();
		System.out.println("Total=>"+count);
		
		// From Given a list of integers, sort the even numbers and stored into set.
	Set<Integer> set=integerList.stream()
		   .filter(i->i%2==0).sorted()
		   .peek(System.out::println)
		   .collect(Collectors.toSet());
	System.out.println(set);
		
		// From Given a list of integers, sort ascending & descending the numbers, print them after sorting and stored into list.

		integerList.stream()
		   .sorted()
		   .peek(System.out::println)
		   .collect(Collectors.toList());
				
		integerList.stream()
		   .sorted(Comparator.reverseOrder())
		   .peek(System.out::println)
		   .collect(Collectors.toList());
	
	
	//From Given a list of Integers, calculate total of them,max,multiple and print them
	Integer	total=integerList.stream().reduce(0, Integer::sum);
	System.out.println("Total=>"+total);
	Integer	max=integerList.stream().reduce(0, Integer::max);
	System.out.println("Max=>"+max);
	Integer	mul=integerList.stream().reduce(1,(n1,n2)->n1*n2);
	System.out.println("Mult=>"+mul);
	
	}

}
