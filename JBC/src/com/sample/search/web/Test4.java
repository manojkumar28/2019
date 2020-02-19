package com.sample.search.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test4 {
	

	public static void main(String[] args) {
		int x = 5;
		//x= !x;
		x= x>>1;
		x+=3;
		x= ~x;
		//x.value();
		System.out.println(x= ~x);
		
		/*System.out.println(Stream.of("green","yellow", "blue").max((s1,s2)-> s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));

		BufferedReader inReader = new BufferedReader("input.dat");
		BufferedReader inReader1 = new BufferedReader(new InputStreamReader("input.dat"));
		BufferedReader inReader2 = new BufferedReader(new File("input.dat"));
		FileReader inReader3 = new FileReader("input.dat");
		BufferedReader inReader4 = new BufferedReader(inReader3);*/
		
		/*Double d=null;
		System.out.println(d instanceof Double?true:false);
		int c=0;
		System.out.println(0==c++?true:false);
		int a=0;
		System.out.println(a!=0?true:false);
		String e="1";
		System.out.println("1"!=e?true:false);
		*/
	}

}
