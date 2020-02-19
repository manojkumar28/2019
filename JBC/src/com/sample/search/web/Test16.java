package com.sample.search.web;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] argList) {
		StringBuilder str = new StringBuilder();
		for (String arg : argList) {
			if(str.indexOf(arg)<1)
				str.append(arg+" ");
		}
		System.out.println(str.toString());
		Scanner sc = new Scanner(str.toString());
		while(sc.hasNextInt()) {
			if(sc.hasNextInt())
				System.out.println(sc.nextInt()+ " ");
			else
				sc.next();
		}

	}

}
