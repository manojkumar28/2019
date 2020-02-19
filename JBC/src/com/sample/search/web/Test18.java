package com.sample.search.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Test18 {
	private static String initString;
	static {
		String currentString = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("initconfig.txt"));
			initString = reader.lines().findFirst().orElse(null);
		} catch (IOException ex) {
			throw new NoSuchElementException("File initconfig.txt");
		}
	}

	public Test18() {
		if (initString.length() == 0) {
			throw new IllegalArgumentException("length is zero");
		}
		System.out.println("it workd");
	}

	public static void main(String[] args) {
		Test18 t = new Test18();
	}
}