package com.javafundamentals;

public class Student {
	int roll_no;
	String name;
	float marks;
	boolean isPassed;
	static void display() {
		//Student1 Details
		Student s1=new Student();
		s1.roll_no=24;
		s1.name="Navisa";
		s1.marks=85;
		s1.isPassed=true;
		System.out.println("STUDENT 1 Details!");
		System.out.println("Roll no: "+s1.roll_no);
		System.out.println("Name: "+s1.name);
		System.out.println("Marks: "+s1.marks);
		System.out.println("Passed : "+s1.isPassed);
		//Student2 Details
		Student s2=new Student();
		s2.roll_no=30;
		s2.name="Navya";
		s2.marks=75;
		s2.isPassed=true;
		System.out.println("STUDENT 2 Details!");
		System.out.println("Roll no: "+s2.roll_no);
		System.out.println("Name: "+s2.name);
		System.out.println("Marks: "+s2.marks);
		System.out.println("Passed : "+s2.isPassed);
		//Student3 Details
		Student s3=new Student();
		s3.roll_no=32;
		s3.name="Mani";
		s3.marks=80;
		s3.isPassed=true;
		System.out.println("STUDENT 3 Details!");
		System.out.println("Roll no: "+s3.roll_no);
		System.out.println("Name: "+s3.name);
		System.out.println("Marks: "+s3.marks);
		System.out.println("Passed : "+s3.isPassed);
		//Student4 Details
		Student s4=new Student();
		s4.roll_no=02;
		s4.name="Chinnu";
		s4.marks=79;
		s4.isPassed=true;
		System.out.println("STUDENT 4 Details!");
		System.out.println("Roll no: "+s4.roll_no);
		System.out.println("Name: "+s4.name);
		System.out.println("Marks: "+s4.marks);
		System.out.println("Passed : "+s4.isPassed);
		
	}
	void Student5() {
		//Student s1=new Student();
		roll_no=24;
		name="Navisa";
		marks=85;
		isPassed=true;
		System.out.println("STUDENT 5 Details!");
		System.out.println("Roll no: "+ roll_no);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("Passed : "+isPassed);
	}
	public static void main(String[] args) {
		display();
		Student s5=new Student();
		s5.Student5();
	}

}
