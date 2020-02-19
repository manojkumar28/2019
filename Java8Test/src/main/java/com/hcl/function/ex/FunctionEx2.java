package com.hcl.function.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.test.ex1.Employee;

public class FunctionEx2 {
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
		Employee E1 =new Employee(1, "Kieran",10);
		Function<Employee, String> getName= e->e.getName();
		System.out.println(getName.apply(E1));
		;

	}

}
