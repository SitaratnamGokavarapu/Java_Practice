package com.javafundamentals.demomethods;

import java.util.Arrays;
import java.util.Scanner;

public class Fraction {
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int den1 = sc.nextInt();
		int num2 = sc.nextInt();
		int den2 = sc.nextInt();

		int result1 = (num1 * den2) + (num2 * den1);
		int result2 = (den1 * den2);
		int gcdValue=gcd(result1,result2);
		result1/=gcdValue;
		result2/=gcdValue;

		System.out.println(result1 + "/" + result2);

		sc.close();
	}

}
