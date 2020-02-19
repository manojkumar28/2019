package com.test.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSolution {
	static List<Employee> list =  Arrays.asList(
			new Employee(1, "Kieran",10),
			new Employee(2, "ABC", 25),

			new Employee(7, "marry", 34),
			new Employee(8, "duke", 77),
			new Employee(9, "mike", 58),
			new Employee(3, "CDF", 34),
			new Employee(4, "xyz", 23),
			new Employee(5, "jak", 65),
			new Employee(6, "jack", 45)
			);

	public static void main(String[] args) {
	
			List<String> filterList = list.stream()
				.filter(e-> e.getAge()>40)
				.map(e->e.getName())
				.sorted()
				.collect(Collectors.toList());
			
			filterList.forEach(System.out::println);
	

	}
}


