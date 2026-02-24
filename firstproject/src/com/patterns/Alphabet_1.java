package com.patterns;

import java.util.Scanner;

public class Alphabet_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for pattern:");
		int n = sc.nextInt();
		for(int i=65;i<n;i++) {
			for(int j=65;j<=i;j++) {
				System.out.print((char)(i));
			}
			System.out.println();
		}
		sc.close();
	}

}
