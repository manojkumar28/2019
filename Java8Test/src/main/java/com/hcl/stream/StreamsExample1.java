package com.hcl.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.hcl.stream.data.Student;
import com.hcl.stream.data.StudentDataBase;

public class StreamsExample1 {

	public static void main(String[] args) {

		// student name and there activities in a map
		Predicate<Student> studentPredicate = (student -> student
				.getGradeLevel() >= 3);
		Predicate<Student> studentgpaPredicate = (student -> student.getGpa() >= 3.9);

		List<String> nameList = 
				StudentDataBase.getAllStudents().stream()
												.filter(studentPredicate)
												.filter(studentgpaPredicate)
												.map(student -> student.getName())
												.collect(Collectors.toList());

		System.out.println(nameList);
	}
}
