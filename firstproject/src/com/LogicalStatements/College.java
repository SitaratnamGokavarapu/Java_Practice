package com.LogicalStatements;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		System.out.println("Enter Attendance percentage:");
		double attendance = sc.nextDouble();
		if (marks > 50 && marks < 100 && attendance > 80.0 && attendance < 100.0) {
			System.out.println("Eligible for a Scholarship of 10,000 rupees");
		} else {
			System.out.println("Not Eligible for Scholarship");
		}
		sc.close();
	}

}
