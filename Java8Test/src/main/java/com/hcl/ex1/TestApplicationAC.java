package com.hcl.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TestApplicationAC {
	static List<String> list = Arrays.asList("**", "***", "*", "*******", "******", "********", "***********");
	
	
	public static void main(String [] args){
		/*Comparator<String> comparator = new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
			
		};*/
		
		Comparator<String> comparatorLambda = (s1,  s2)-> Integer.compare(s1.length(), s2.length());
		
		
		
		Collections.sort(list, comparatorLambda);
		System.out.println(list);

	}

	}


