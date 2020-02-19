/**
 * 
 */
package com.java.core.fundamental.defaultmethod;

/**
 * @author manoj.krm
 *
 */
@FunctionalInterface
public interface Interface1 {
	void method1();

	default void log(String log) {
		System.out.println("Log method=>" + log);
	}

	static void print(String str) {
		System.out.println("Printing ..." + str);
	}
	/*
	 * compile time error: A default method cannot override a method from
	 * java.lang.Object
	 */
	/*
	 * default String toString() { return "1"; }
	 */
}
