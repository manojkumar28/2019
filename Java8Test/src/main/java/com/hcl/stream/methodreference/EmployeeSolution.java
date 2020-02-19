package com.hcl.stream.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeSolution {
	static List<Employee> list =  Arrays.asList(
			new Employee(1, "Kieran",10),
			new Employee(2, "ABC", 25),
			new Employee(2, "Amar", 20),

			new Employee(7, "marry", 34),
			new Employee(8, "duke", 77),
			new Employee(8, "duke", 77),
			new Employee(9, "mike", 58),
			new Employee(3, "CDF", 34),
			new Employee(4, "xyz", 23),
			new Employee(5, "jak", 65),
			new Employee(6, "jack", 45)
			);

	public static void main(String[] args) {
		
		//Print the employee name in natural order whose age greater then 40.
		List<String> filterList = list.stream().filter(e-> e.getAge()>40).map(e->e.getName()).sorted().collect(Collectors.toList());
		filterList.forEach(System.out::println);
			
		// Print the employee name whose name start with "A".
		list.stream().filter(e->(e.getName().charAt(0)=='A')).map(s->s.getName()).forEach(System.out::println);
			
		// Print the empID of employees whose age is even.
		list.stream().filter(e-> e.getAge()%2==0).forEach(e->System.out.println(e.getEmpid()));
			
		// Stored the employee into list in sorted order based on employee name.
		List<Employee> srtlst=list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		srtlst.forEach(System.out::println);
		
		System.out.println("=====>");
		// Stored the distinct employee into list means employee ID should be unique for each employee.
		List<Employee>	ls=list.stream().filter(distinctByKey(Employee::getEmpid)).collect(Collectors.toList());
		ls.forEach(System.out::println);
		
		System.out.println("#####=>");
		// Stored the distinct employee into list means employee ID should be unique for each employee.
		List<Employee>	lst=list.stream().distinct().collect(Collectors.toList());
		lst.forEach(System.out::println);
		
		// Calculate the total of age of employee whose empID is even and name start with "A".
		Long total=list.stream().filter(e->(e.getName().charAt(0)=='A')).filter(e->e.getEmpid()%2==0).count();
		System.out.println("Total=>"+total);
	
		Optional<Integer> totalAg=list.stream().filter(e->(e.getName().charAt(0)=='A')).filter(e->e.getEmpid()%2==0).map(e->e.getAge()).reduce(Integer::sum);
		System.out.println("Total=>"+(totalAg.isPresent()?totalAg.get():"NA"));
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}
}


