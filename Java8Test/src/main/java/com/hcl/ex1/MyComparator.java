package com.hcl.ex1;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}

}
