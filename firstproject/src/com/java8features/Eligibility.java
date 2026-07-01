package com.java8features;

import java.util.function.Predicate;

public class Eligibility {
	double marks;
	double attendance;
	String sname;

	public Eligibility(double d, double e, String sname) {
		super();
		this.marks = d;
		this.attendance = e;
		this.sname = sname;
	}


	public static void main(String[] args) {
		Predicate<Eligibility> p= (m)->m.marks>85;
		Predicate<Eligibility> p1= (a)->a.attendance>75;

		Eligibility e=new Eligibility(84.0,76.0,"Navya");
		if(p.and(p1).test(e)) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
		
	}

}
