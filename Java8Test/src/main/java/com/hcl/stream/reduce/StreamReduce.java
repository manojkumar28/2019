package com.hcl.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,3,5,7);
		System.out.println(intList.stream().reduce((i1,i2)->i1*i2));
	}

}
