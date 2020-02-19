package com.hcl.ex3;

public class TestApplication {

	public static void main(String[] args) {
		/*Runnable runnable =  new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In Child thread");
				
			}
		};
		*/
			
	   Runnable runnable = ()-> System.out.println("In Child thread");
		
	
		Thread t1= new Thread(runnable);
		t1.start();
		
		
		
	}

}
