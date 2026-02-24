package com.patterns;

import java.util.Scanner;

//   A
//  ABA
// ABCBA
//ABCDCBA

public class Alphabet_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for pattern:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			char ch = 'A';
			for (int j = n; j >i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(ch++);

			}
			char c = ch;
			--c;
			for (int j = 0; j < i; j++) {

				System.out.print(--c);
			}

			System.out.println();
		}

		sc.close();
	}

}
