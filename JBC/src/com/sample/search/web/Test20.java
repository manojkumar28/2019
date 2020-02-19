package com.sample.search.web;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test20 {
	String s;
	List<Integer> lst;
	Test20(String s){
		this.s=s;
		lst=new LinkedList<>();
		for(int i=0;i<this.s.length();++i) {
			lst.add(i);
		}
	}

	public static void main(String[] args) {
//Stream.of(new Test20("Mercury"),new Test20("Venus"),new Test20("Earth")).flatMap(i->i.lst.stream()).mapToInt(j->j).max().ifPresent(s->System.out.println(s));
	
	List<String> names=Arrays.asList("Jupiter","Neptune","Mars","Earth");
	Map<Integer,List<String>> name_Length=names.stream().collect(Collectors.groupingBy(p->p.length()));
	name_Length.forEach((l,s)->System.out.println(l+"="+s+" "));
	System.out.println();
	}

}
