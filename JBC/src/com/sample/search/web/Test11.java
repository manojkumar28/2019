package com.sample.search.web;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Test11 {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		FileWriter output = new FileWriter(file);
		
		/*
		 * PrintWriter p = new PrintWriter(output);
		 * Stream.of('0','1','2','3','4').forEach(p::write);
		 */
		
		/*
		 * Stream.of('0','1','2','3','4').forEach(t -> { try { output.write(t); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * });
		 */
		
		output.write(new char[] {'0','1','2','3','4'});
		output.flush();

	}

}
