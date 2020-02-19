package com.hcl.ex2;

import java.io.File;
import java.io.FileFilter;


public class TestApplicationAC {

	public static void main(String[] args) {
	/*	FileFilter fileFilter=new FileFilter(){

			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			}
			
		};*/
		FileFilter fileFilter=  file-> file.getName().endsWith(".java");
		
		File dir = new File("C:/Users/ankur.jain/Desktop/Java 8 Material/Java8Features/src/com/rs/ex1");
		File[] javaFiles =dir.listFiles(fileFilter);
		
		for(File tempFile : javaFiles) {
			System.out.println(tempFile);
		}
	}

}
