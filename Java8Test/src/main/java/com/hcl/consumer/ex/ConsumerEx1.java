package com.hcl.consumer.ex;

import java.util.function.Consumer;

public class ConsumerEx1 {

	
	
	public static void main(String[] args) {
		
		Consumer<String> C = S ->System.out.println(S);
		C.accept("Hello Consumer Ex");
		

	}

}
