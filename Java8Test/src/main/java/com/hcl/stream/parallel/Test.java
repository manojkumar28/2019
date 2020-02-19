package com.hcl.stream.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test {

	public static Long sumApply(Supplier<Integer> a,int no) {
		Long start=System.currentTimeMillis();
		for(int i=0;true;i++) {
			a.get();
		}
		//return System.currentTimeMillis()-start;
	}
	public static int sumSequence() {
		return IntStream.rangeClosed(0, 1000000000).sum(); 
	}
	
	public static int sumParllel() {
		return IntStream.rangeClosed(0, 1000000000).parallel().sum(); 
	}
	public static void main(String[] args) {
		System.out.println("Parllel Time:"+sumApply(Test::sumParllel, 20));
		System.out.println("Seuqence Time:"+sumApply(Test::sumSequence, 20));
	}

}
