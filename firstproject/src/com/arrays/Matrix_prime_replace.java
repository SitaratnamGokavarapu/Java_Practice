package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

// 1 2 1
// 2 4 1
// 9 9 9

public class Matrix_prime_replace {

	private static boolean isPrime(int i) {
		if (i == 0 || i == 1) {
			return false;
		}
		for (int j = 2; j < i; j++) {
			while (i % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
//		boolean[][] arr1=new boolean[3][3];
		// Taking input from User
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// Displaying the Input
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int primeNum = 2;
		// After Changing/solving the case
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (isPrime(i + j)) {
					while (!isPrime(primeNum)) {
						primeNum++;
					}
					arr[i][j] = primeNum;
					primeNum++;
				}
			}
		}
		// Displaying the output
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
