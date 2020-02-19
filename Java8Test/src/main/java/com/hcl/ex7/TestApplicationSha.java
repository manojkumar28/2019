package com.hcl.ex7;

public class TestApplicationSha {
	public static void main(String[] args) {
		MyInterface4 interface4=String::length;
		System.out.println(interface4.printLength("Hello World"));
	}
	
}
