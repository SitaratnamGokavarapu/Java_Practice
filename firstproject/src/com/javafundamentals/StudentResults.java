package com.javafundamentals;

import java.util.Scanner;

public class StudentResults {
	int English;
	int Telugu;
	int Maths;
	int Science;
	int Social;

	void T_M(int eng, int tel, int math, int sci, int soc) {
		int tot_marks = eng + tel + math + sci + soc;
		System.out.println("Total Marks: " + tot_marks);
	}

	void Avg_Mark(int eng, int tel, int math, int sci, int soc) {
		double avg = (eng + tel + math + sci + soc) / 5.0;
		System.out.println("Average Marks: " + avg);
	}

	void ShowDetails(int eng, int tel, int math, int sci, int soc) {
//		double total_marks = eng + tel + math + sci + soc;
//		double avg_marks = total_marks / 5;
		System.out.println("English Marks: " + eng);
		System.out.println("Telugu Marks: " + tel);
		System.out.println("Maths Marks: " + math);
		System.out.println("Science Marks: " + sci);
		System.out.println("Social Marks: " + soc);
//		System.out.println("Total Marks: " + total_marks);
//		System.out.println("Average Marks: " + avg_marks);
	}

	public static void main(String[] args) {
		StudentResults s = new StudentResults();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English Marks: ");
		s.English  = sc.nextInt();
		System.out.println("Enter Telugu Marks: ");
		s.Telugu = sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		s.Maths = sc.nextInt();
		System.out.println("Enter Science Marks: ");
		s.Science = sc.nextInt();
		System.out.println("Enter Social Marks: ");
		s.Social = sc.nextInt();
		s.ShowDetails(s.English,s.Telugu,s.Maths,s.Science,s.Social);
		s.T_M(s.English,s.Telugu,s.Maths,s.Science,s.Social);
		s.Avg_Mark(s.English,s.Telugu,s.Maths,s.Science,s.Social);
		sc.close();

	}

}
