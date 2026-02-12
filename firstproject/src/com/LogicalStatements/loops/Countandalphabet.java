package com.LogicalStatements.loops;

import java.util.Scanner;

public class Countandalphabet {
	static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		char ch = 'A';

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i + " " + ch);
			}
			ch++;
		}
		sc.close();
	}

}
