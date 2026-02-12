package com.arrays;

import java.util.Scanner;

public class Student_marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] marks = new int[size];
		System.out.println("Enter Marks:");
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
		}
		double totalmarks=0;
		double avg=0;
		for(int i=0;i<marks.length;i++) {
			totalmarks+=marks[i];
		}
		avg=totalmarks/marks.length;
		System.out.println("Total Marks: "+totalmarks);
		System.out.println("Total Average: "+avg);
		
		
		sc.close();
	}

}
