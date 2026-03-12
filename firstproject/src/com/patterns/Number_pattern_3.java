package com.patterns;

import java.util.Scanner;

public class Number_pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no . of rows:");
		int rows = sc.nextInt();
		int k = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

		sc.close();
	}

}
