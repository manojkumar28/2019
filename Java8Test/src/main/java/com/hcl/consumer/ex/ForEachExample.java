package com.hcl.consumer.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> data = new ArrayList<>(); 
        data.add("New Delhi"); 
        data.add("New York"); 
        data.add("Mumbai"); 
        data.add("London"); 
  
        data.forEach(System.out::println); 
        
        //Consumer<String> consumer1 = S->System.out.println(S); 
       // Consumer<String> consumer2 = System.out::println;
        

	}

}
