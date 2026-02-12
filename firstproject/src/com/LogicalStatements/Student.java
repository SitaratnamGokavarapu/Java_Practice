package com.LogicalStatements;

import java.util.Scanner;

public class Student {
	int telugu;
	int hindi;
	int english;
	int maths;
	int science;
	int social;
	
	void display() {
		int marks=telugu+hindi+english+maths+science+social;
		double avg=(marks)/6.0;
		if(marks>=540 && marks<600) {
			System.out.println("Grade A+");
		}else if(marks>=450 && marks<540) {
			System.out.println("Grade A");
		}else if(marks>=360 && marks<450) {
			System.out.println("Grade B");
		}else if(marks>=270 && marks<360) {
			System.out.println("Grade C");
		}else if(marks>=0 && marks<270) {
			System.out.println("Fail!!");
		}else {
			System.out.println("Invalid Marks!!");
		}
		System.out.println("Marks:"+marks);
		System.out.println("Average:"+avg);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Student s=new Student();
		s.telugu=sc.nextInt();
		s.hindi=sc.nextInt();
		s.english=sc.nextInt();
		s.maths=sc.nextInt();
		s.science=sc.nextInt();
		s.social=sc.nextInt();
		s.display();
		sc.close();
		}

}
