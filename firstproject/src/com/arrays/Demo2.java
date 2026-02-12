package com.arrays;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// using int
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
//		int arr[] = new int[size];
//		for (int i = 0; i < size; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}
		// using float
//		float arr1[] = new float[size];
//		for (int i = 0; i < size; i++) {
//			arr1[i] = sc.nextFloat();
//		}
//		for (float i : arr1) {
//			System.out.println(i);
//		}
		// using double
		double arr2[] = new double[size];
		for (int i = 0; i < size; i++) {
			arr2[i] = sc.nextDouble();
		}
		for (double i : arr2) {
			System.out.println(i);
		}

		sc.close();
	}

}
