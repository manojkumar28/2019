package com.hcl.ex2;

import java.io.File;
import java.io.FileFilter;

public class TestApplicationWL {

	public static void main(String[] args) {
		
		FileFilter myFilter = new FileFilter(){

			@Override
			public boolean accept(File filename) {
				return filename.getName().endsWith(".java");
			}
			
		};
		
		//FileFilter myFilter =  file -> file.getName().endsWith(".java");
		
		
		
		File dir = new File("C:/Users/ankur.jain/Desktop/Java 8 Material/Java8Features/src/com/rs/ex1");
		File[] javaFiles =dir.listFiles(myFilter);
		
		for(File tempFile : javaFiles) {
			System.out.println(tempFile);
		}
	}

}
