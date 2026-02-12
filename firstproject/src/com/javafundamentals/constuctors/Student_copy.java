package com.javafundamentals.constuctors;

public class Student_copy {

	int rollno;
	String name;
	String branch;

	public Student_copy(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Student_copy(Student_copy s, String branch) {
		this.branch = branch;
		this.rollno = s.rollno;
		this.name = s.name;
	}

	public static void main(String[] args) {
		Student_copy s1 = new Student_copy(501, "XYZ");
		s1.show();

		Student_copy s2 = new Student_copy(s1, "CSE");
		s2.show();
	}

	void show() {
		System.out.println("*****************");
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll no: " + rollno);
		System.out.println("Student branch: " + branch);
	}

}
