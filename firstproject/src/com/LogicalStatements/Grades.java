package com.LogicalStatements;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		String status = (marks>=90)?("Grade A"):(marks>=75||marks<90)?("Grade B"):(marks>=60||marks<75)?("Grade C"):(marks>=40||marks<60)?("Grade D"):("Grade F");
		System.out.println(status);
		if(marks>=75) {
			System.out.println("You are eligible for scholarship!");
		}else {
			System.out.println("You are not eligible for scholarship!");
		}
		sc.close();
	}

}
