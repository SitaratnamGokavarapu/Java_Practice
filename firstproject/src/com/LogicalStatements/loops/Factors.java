package com.LogicalStatements.loops;

import java.util.Scanner;

public class Factors {
	
	
	void factors(int n) {
		System.out.println("Factors of " + n + " are:");
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {

				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Factors f = new Factors();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();

		f.factors(n);
		sc.close();
	}

}
