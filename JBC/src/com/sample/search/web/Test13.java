package com.sample.search.web;

import java.math.BigDecimal;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesInvoice sv = new SalesInvoice();
		System.out.println(Invoice.formatId("1234"));
		
		Invoice v = new SalesInvoice();
		System.out.println(v.formatId("1234"));
		
		Invoice v2 = new Invoice();
		System.out.println(v2.formatId("1234"));
		
		SalesInvoice sv2 = new SalesInvoice();
		System.out.println(sv2.formatId("1234"));
	}

}
 class Invoice{
	 public static String formatId(String oldId) {
		 return oldId+"_Invoice";
	 }
 }
 class SalesInvoice extends Invoice{
	 public static String formatId(String oldId) {
		 return oldId+"_SalesInvoice";
	 }
 }