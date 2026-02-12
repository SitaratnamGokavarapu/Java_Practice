package com.LogicalStatements;

import java.util.Scanner;

public class LeapYear {
	int year;
	public void Leap() {
	if(((year%4==0) && (year%100!=0)) ||(year%400==0)) {
		System.out.println(year+"is a Leap Year");
	}
	else {
		System.out.println(year +" is not a Leap year");
	}
	}
	public static void main(String[] args) {
		LeapYear l=new LeapYear();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		l.year=sc.nextInt();
		l.Leap();
		sc.close();
		}

}
