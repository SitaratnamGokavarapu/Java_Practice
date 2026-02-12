package com.javafundamentals.constuctors;

public class Student {
	
	int sid;
	String sname;
	int age;
	long mobile;
	
	Student(){
		System.out.println("No Arguments Constructor Called!!!");
		sid=501;
		sname="anu";
		age=20;
		mobile=9876543210L;
	}
	Student(int sid){
		System.out.println("One Argument Constructor Called!!!");
		this.sid=sid;
	}
	
	Student(int sid,String sname){
		System.out.println("Two Argument Constructor Called!!!");
		this.sid=sid;
		this.sname=sname;
	}
	
	Student(int sid,String sname,int age){
		System.out.println("Three Argument Constructor Called!!!");
		this.sid=sid;
		this.sname=sname;
		this.age=age;
	}
	
	Student(int sid,String sname,int age,long mobile){
		System.out.println("Four Argument Constructor Called!!!");
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		this.mobile=mobile;
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
//		Student s1=new Student(501);
//		s1.display();
//		Student s2=new Student(501,"Navisa");
//		s2.display();
//		Student s3=new Student(502,"Navya",20);
//		s3.display();
//		Student s4=new Student(503,"Likitha",22,7465986240L);
//		s4.display();
	}
	void display() {
		System.out.println("Student id :"+sid);
		System.out.println("Student name: "+sname);
		System.out.println("Student age :"+age);
		System.out.println("Student mobile: "+mobile);
		
	}

}

