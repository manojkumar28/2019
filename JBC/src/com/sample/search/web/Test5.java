package com.sample.search.web;

import java.util.Set;

class MyCollection<T> {
	private Set<T> set;
	public Set<T> getCollection(){
		return this.set;
	}
}
public class Test5 {

	public static void main(String[] args) {
		MyCollection<?> collection = new MyCollection();
		Set<E> set = collection.getCollection();
		Set<T> set1 = collection.getCollection();
		Set<?> set2 = collection.getCollection();
		Set<> set3 = collection.getCollection();
		Set set4 = collection.getCollection();

	}

}
