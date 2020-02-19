package com.hcl.ex8;

import java.util.function.Predicate;

@FunctionalInterface
public interface MyInterface1 {
	
	
	public void printHello(String S);
	
	
	default public void myDefaultMethod(String S) {
		System.out.println("from Default method, Hello "+S);
	}
	
	static public void myStaticMethod1(String S) {
		System.out.println("Hello "+S);
	}
	 
	/***/
	
	@Override
	boolean equals(Object obj);
	
	
}
