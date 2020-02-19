package com.sample.search.web;

public class Test17 {
	public static void main(String[] args) {
		/*
		 * Shape shape = new Quadrilateral(); Quadrilateral quadrilateral = new
		 * Quadrilateral();
		 * 
		 * 
		 * //Triangle tri = (Triangle) quadrilateral; shape = quadrilateral;
		 */
		
		int i = 10, j = 12;
		for (;;) {
			if (i++ < j--)
				continue;
			else
				break;
			System.out.println(i + " " + j);
		}
	}
}

class Shape {

}

class Quadrilateral extends Shape {

}

class Triangle extends Shape {

}