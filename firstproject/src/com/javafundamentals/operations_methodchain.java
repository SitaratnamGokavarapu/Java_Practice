package com.javafundamentals;

import java.util.Scanner;

public class operations_methodchain {
	int addition(int a, int b) {
		int sum=a+b;
		return sum;
	}

	int subtraction(int a, int b) {
		int diff =addition(a,b)-b;
		return diff;
	}

	int multiplication(int a, int b) {
		int mul=subtraction(a,b) * b;
		return mul;
	}
	public static void main(String[] args) {
		
		operations_methodchain om=new operations_methodchain();
		
		Scanner sc = new Scanner(System.in);

		// Addition
		System.out.println("Enter a Value: ");
		int a = sc.nextInt();
		System.out.println("Enter b Value: ");
		int b = sc.nextInt();
		System.out.println("Addition of Two numbers: " + om.addition(a, b));

		// Subtraction
		System.out.println("Enter a Value: ");
		int c = sc.nextInt();
		System.out.println("Enter b Value: ");
		int d = sc.nextInt();
		System.out.println("Subtraction of Two numbers: " + om.subtraction(c, d));

		// Multiplication
		System.out.println("Enter a Value: ");
		int e = sc.nextInt();
		System.out.println("Enter b Value: ");
		int f = sc.nextInt();
		System.out.println("Multipication of Two numbers: " + om.multiplication(e, f));
		
		sc.close();
	}

}
