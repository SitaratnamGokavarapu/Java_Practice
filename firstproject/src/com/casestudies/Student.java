package com.casestudies;

import java.util.Scanner;

public class Student {
	static String college_name;
	static int student_id;
	String student_name;
	String course;
	static int student_id_counter = 0;
	static {
		college_name = "ABC Engineering college";
		student_id = 1000;
		System.out.println("College Initialized");
	}
	{
		System.out.println("New Student object created");
		student_id = student_id++;
		student_id_counter++;
	}

	Student(String student_name, String course) {
		this.student_name = student_name;
		this.course = course;
	}

	void display_Details() {
		System.out.println(college_name);
		System.out.println(student_id);
		System.out.println(student_name);
		System.out.println(course);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student("Navya", "JFS");
		s.display_Details();
		Student s1 = new Student("Sitaratnam", "JFS");
		s1.display_Details();
		System.out.println("Total Students count:" + student_id_counter);
		sc.close();
	}

}
