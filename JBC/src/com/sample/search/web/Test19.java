package com.sample.search.web;

public class Test19 {
	public Test19() {
		//this();
		super();
		//this();
	}
	void test() {
		super().clone();
		this().clone();
	}
	public static void main(String[] args) {
		Double d = 1.0;
		if (d instanceof Number)
			d = d++;
		boolean condition1 = (d == 2) ? true : false;
		if (condition1)
			System.out.println("Perform acion 1");

		double e = 1.0;
		if ((Double) e instanceof Double | d++ == e++)
			d += d;

		boolean condition2 = (d > 2) ? true : false;
		if (condition2)
			System.out.println("Perform acion 2");

		boolean condition3 = condition1 ^ condition2;
		if (condition3)
			System.out.println("Perform acion 3");
	}
}