package com.javaintro;

public class Student {
	int id;
	String name;
	long mobile_no;
	void stud(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(mobile_no);
	}
	static void display(){
		Student n=new Student();
		n.id = 30;
		n.name = "Navya";
		n.mobile_no = 7075857370L;
		n.stud();
	}

	public static void main(String[] args) {
		display();
	}

}
