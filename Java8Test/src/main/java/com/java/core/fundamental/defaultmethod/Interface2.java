/**
 * 
 */
package com.java.core.fundamental.defaultmethod;

/**
 * @author manoj.krm
 *
 */
@FunctionalInterface
public interface Interface2 {
	void method1();

	default void log(String log) {
		System.out.println("Log method=>" + log);
	}
	default void log1(String log) {
		System.out.println("Log method=>" + log);
	}
	default void log2(String log) {
		System.out.println("Log method=>" + log);
	}

}
