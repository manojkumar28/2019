package com.hcl.supplier.ex;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierEx1 {

	
	
	public static void main(String[] args) {
		Supplier<Date> S = () -> new Date();
		System.out.println(S.get());
		
		

	}

}
