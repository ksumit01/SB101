package com.masai.day_02.q3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class StrudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of student you want to add");
//		Function<Double, Double> celsiusToFahrenheit = (Double celsius) -> (celsius * 9 / 5) + 32;
		int n = sc.nextInt();
		List<Student> st = new ArrayList<>();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Roll No.");
			int roll = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Marks");
			int marks = sc.nextInt();
			st.add(new Student(roll,name,marks));
		}
		System.out.println(st);
		
		//Function functional interface
		Function<List<Student>, Map<String, List<Student>>> classifyStudents = students -> {
		    Map<String, List<Student>> classifiedMap = new HashMap<>();

		    List<Student> failedStudents = new ArrayList<>();
		    List<Student> passedStudents = new ArrayList<>();
		    List<Student> topperStudents = new ArrayList<>();

		    for (Student student : students) {
		        if (student.getMarks() < 165) {
		            failedStudents.add(student);
		        } else if (student.getMarks() < 400) {
		            passedStudents.add(student);
		        } else if (student.getMarks() >= 500) {
		            topperStudents.add(student);
		        }
		    }

		    classifiedMap.put("Fail", failedStudents);
		    classifiedMap.put("Pass", passedStudents);
		    classifiedMap.put("Topper", topperStudents);

		    return classifiedMap;
		};
		
//		calling the apply() method of functional Interface
		Map<String, List<Student>> std = classifyStudents.apply(st);
		
		//consumer interface to print the map
		Consumer<List<Student>> t = s-> System.out.println(s);
		//How to print the std using Consumer
		
//		Biconsumer<T,U> to print the key and value of Map
		std.forEach((key, value) -> {
		    System.out.println("Key: " + key);
		    System.out.println("Value: "+value);
//		    t.accept(value);
		});

		
		
	}
	
	

}
