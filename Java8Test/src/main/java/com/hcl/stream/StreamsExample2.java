package com.hcl.stream;

import java.util.function.Function;
import java.util.stream.Stream;

import com.hcl.stream.data.Student;
import com.hcl.stream.data.StudentDataBase;

public class StreamsExample2 {

	public static void main(String[] args) {

		
		Function<Student, String> f = new Function<Student, String>() {

			@Override
			public String apply(Student s) {
				//System.out.println("in function :"+s.getName());
				return s.getName();
			}
			
		};
	
		Stream<String> S1 =
				StudentDataBase.getAllStudents().stream()
												//.filter(s -> s.getGradeLevel()>=3)
												.map(f);
		S1.forEach(System.out::println);
		S1.forEach(System.out::println);
							
		
		
			
		
	}
}
