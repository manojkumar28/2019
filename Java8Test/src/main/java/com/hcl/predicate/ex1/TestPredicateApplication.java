package com.hcl.predicate.ex1;

import java.util.function.Consumer;

import com.test.ex1.Employee;

public class TestPredicateApplication {

	public static void main(String[] args) {
		//Consumer<Employee> consumer= s->System.out.println(s.getAge());
		Consumer<Employee> consumer= System.out::println;
		consumer.accept(new Employee(1, "name", 15));
	}

}
