package com.operators;

import java.util.Scanner;

public class arithmetic1 {
	
	int a;
	int b;
	static int Sum(int a,int b) {
		Mul(a,b);
		return a+b;
	}
	
	int Diff(int a,int b) {
		Div(a,b);
		return a-b;
	}
	
	static void Mul(int a,int b) {
		System.out.println("Multiplication: "+a*b);
	}
	
	void Div(int a,int b) {
		System.out.println("Division: "+a/b);
	}
	
	public static void main(String[] args) {
		arithmetic1 a1=new arithmetic1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		a1.a=sc.nextInt();
		System.out.println("Enter b value:");
		a1.b=sc.nextInt();
//		Sum(10,20);
//		a1.Diff(a1.a,a1.b);
//		Mul(25,4);
//		a1.Div(25,4);
		a1.show();
		sc.close();
		
	}
	
	void show() {
		System.out.println("Sum: "+arithmetic1.Sum(a,b));
		System.out.println("Diff: "+Diff(a,b));
		
	}
}
