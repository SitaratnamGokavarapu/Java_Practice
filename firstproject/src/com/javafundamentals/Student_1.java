package com.javafundamentals;

public class Student_1 {
	int id;
	String name;
	String Branch;
	int marks;

	Student_1(int id, String name, String Branch, int marks) {
		this.id = id;
		this.name = name;
		this.Branch = Branch;
		this.marks = marks;
		System.out.println("Student id:" + id);
		System.out.println("Student name:" + name);
		System.out.println("Student Branch:" + Branch);
		System.out.println("Student marks:" + marks);
	}

	void display() {
		System.out.println("Student id:" + id);
		System.out.println("Student name:" + name);
		System.out.println("Student Branch:" + Branch);
		System.out.println("Student marks:" + marks);
	}

	public static void main(String[] args) {
//		Student_1 s = new Student_1(583, "Navya", "CSE", 75);
//		s.display();
		new Student_1(583, "Navya", "CSE", 75);
	}

}
