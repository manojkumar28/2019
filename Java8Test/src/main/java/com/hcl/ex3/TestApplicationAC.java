package com.hcl.ex3;

public class TestApplicationAC {

	public static void main(String[] args) {
		/*Runnable runnable =  new Runnable() {
			
			@Override
			public void run() {
				System.out.println("In Child thread");
				
			}
		};*/
		
			
		//Mythread runnable = new Mythread();
		Runnable runnable = ()->  System.out.println("In Child thread");
			
		
				
		Thread t1= new Thread(runnable);
		t1.start();
		
		
		
	}

}
