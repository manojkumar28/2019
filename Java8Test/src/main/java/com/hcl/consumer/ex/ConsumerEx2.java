package com.hcl.consumer.ex;

import java.util.function.Consumer;



public class ConsumerEx2 {

	
	
	public static void main(String[] args) {
		Employee E1 =new Employee(1, "Kieran",10);
		Consumer<Employee> C = e->System.out.println(e.getName());
		C.accept(E1);
	}

}
