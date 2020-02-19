package com.hcl.stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hcl.stream.data.Student;
import com.hcl.stream.data.StudentDataBase;

public class TestStream {

	public static void main(String[] args) {
		/*
		 * List<String> student=StudentDataBase.getAllStudents().stream()
		 * .filter(p->p.getGender().equalsIgnoreCase("female")) .map(p->p.getName())
		 * .collect(Collectors.toList()); System.out.println(student);
		 */

		/*
		 * List<List<String>> student1=StudentDataBase.getAllStudents().stream()
		 * //.filter(p->p.getGender().equalsIgnoreCase("female"))
		 * .map(p->p.getActivities()) .collect(Collectors.toList());
		 * System.out.println(student1);
		 */

		/*
		 * List<String> student2=StudentDataBase.getAllStudents().stream()
		 * //.filter(p->p.getGender().equalsIgnoreCase("female"))
		 * .map(Student::getActivities) .flatMap(List::stream)
		 * .collect(Collectors.toList()); System.out.println(student2);
		 * student2.forEach(System.out::println);
		 */

		/*
		 * List<String> student2=StudentDataBase.getAllStudents().stream()
		 * //.filter(p->p.getGender().equalsIgnoreCase("female"))
		 * .map(Student::getActivities) .flatMap(List::stream).distinct().sorted()
		 * .collect(Collectors.toList()); System.out.println(student2);
		 * student2.forEach(System.out::println);
		 */

		/*
		 * System.out.println(StudentDataBase.getAllStudents().stream()
		 * //.filter(p->p.getGender().equalsIgnoreCase("female"))
		 * .map(Student::getActivities)
		 * .flatMap(List::stream).distinct().sorted().count());
		 */

//((Stream<Student>) StudentDataBase.getAllStudents()).sorted((s1,s2)->s1.getName().equals(s2.getName() return 0).forEach(System.out::println);

	/*	StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.forEach(System.out::println);

		Map<String, List<String>> student2 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(student2);
		
		StudentDataBase.getAllStudents().stream()
		.collect(Collectors.toMap(Student::getName, Student::getActivities)).forEach((k,v)->System.out.println(k+"=>"+v));
*/
		System.out.println(StudentDataBase.getAllStudents().stream().anyMatch(s->s.getGradeLevel()>3));
		System.out.println(StudentDataBase.getAllStudents().stream().allMatch(s->s.getGradeLevel()>=3));
		System.out.println(StudentDataBase.getAllStudents().stream().noneMatch(s->s.getGradeLevel()>4));

		System.out.println(StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3).findAny());
		System.out.println("-----");
		System.out.println(StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3).findFirst());
	}
}
