package com.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
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
			List<Employee> filterList = new ArrayList<Employee>();
			for(Employee e : list){
				if(e.getAge()>40){
					filterList.add(e);
				};
			}
			
			List<String> filterListName = new ArrayList<String>();
			for(Employee e : filterList){
				filterListName.add(e.getName());
			}
			
			Collections.sort(filterListName);
			
			System.out.println(filterListName);
	

	}
}


