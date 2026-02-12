package com.javafundamentals;

import java.util.Scanner;

public class Operations {
	int addition(int a, int b) {
		return a + b;
	}

	int subtraction(int a, int b) {
		return a - b;
	}

	int multiplication(int a, int b) {
		return a * b;
	}

	void main() {
		Scanner sc = new Scanner(System.in);

		// Addition
		System.out.println("Enter a Value: ");
		int a = sc.nextInt();
		System.out.println("Enter b Value: ");
		int b = sc.nextInt();
		System.out.println("Addition of Two numbers: " + addition(a, b));

		// Subtraction
		System.out.println("Enter a Value: ");
		int c = sc.nextInt();
		System.out.println("Enter b Value: ");
		int d = sc.nextInt();
		System.out.println("Subtraction of Two numbers: " + subtraction(c, d));

		// Multiplication
		System.out.println("Enter a Value: ");
		int e = sc.nextInt();
		System.out.println("Enter b Value: ");
		int f = sc.nextInt();
		System.out.println("Multipication of Two numbers: " + multiplication(e, f));

		sc.close();
	}

}
