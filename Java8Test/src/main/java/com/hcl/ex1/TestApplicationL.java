package com.hcl.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestApplicationL {
	static List<String> list = Arrays.asList("**", "***", "*", "*******", "******", "********", "***********");
	
	public static void main(String[] args) {
		
		
		Comparator<String> comparator = ( s1,  s2) -> Integer.compare(s1.length(), s2.length());
		;
		
		Collections.sort(list, comparator);
		
		//Collections.sort(list, lamdaComparator);
		System.out.println(list);
	}

}
