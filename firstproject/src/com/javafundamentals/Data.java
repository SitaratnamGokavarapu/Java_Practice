package com.javafundamentals;

public class Data {
	byte class_no;
	short count;
	int roll;
	long phone;
	float percent;
	double weight;
	char gender;
	boolean female;
	public static void main(String[] args) {
		Data n= new Data();
		n.class_no= 5;
		n.count= 70;
		n.roll=583;
		n.phone=1234567890;
		n.percent=96.5f;
		n.weight=50d;
		n.gender='F';
		n.female= true;
		
		System.out.println(n.class_no);
		System.out.println(n.count);
		System.out.println(n.roll);
		System.out.println(n.phone);
		System.out.println(n.percent);
		System.out.println(n.weight);
		System.out.println(n.gender);
		System.out.println(n.female);

	}

}	
