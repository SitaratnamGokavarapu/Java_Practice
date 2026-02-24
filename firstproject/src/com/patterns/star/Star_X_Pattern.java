package com.patterns.star;

import java.util.Scanner;

public class Star_X_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for pattern:");
		int n = sc.nextInt();// 5

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (i + j == n + 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
