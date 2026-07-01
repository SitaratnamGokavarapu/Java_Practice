package com.java8features;

import java.util.Scanner;
import java.util.function.Predicate;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=sc.nextInt();
		Predicate<Integer> p= (y)-> (y%4==0 && y%100!=0) || y%400==0;
		
		if(p.test(year)) {
			System.out.println(year + "is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
	}

}
