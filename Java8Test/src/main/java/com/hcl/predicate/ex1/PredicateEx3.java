package com.hcl.predicate.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateEx3 {

	public static void main(String[] args) {
		
		
		
		
		Collection<Integer> collection = new ArrayList<Integer>(3);
		/*Predicate<Collection> p= new Predicate<Collection>() {

			@Override
			public boolean test(Collection t) {
				// TODO Auto-generated method stub
				return t.isEmpty();
			}
			
		};*/
		
		
		Predicate<Collection> p =t-> t.isEmpty();
		
		
		Predicate<Collection> P = C -> C.isEmpty();
		System.out.println(p.test(collection));
		

	}

}
