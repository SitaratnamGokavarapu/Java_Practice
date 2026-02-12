package com.arrays;

import java.util.Scanner;

public class Sum_in_Array {

	public static void main(String[] args) {
//		int[] arr1 = { 10, 20, 30, 40 };
//		int[] arr2 = { 40, 50, 60, 70, 80 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter elements:");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size:");
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter elements:");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		int maxLength = Math.max(arr1.length, arr2.length);
		int[] arr = new int[maxLength];

		for (int i = 0; i < arr.length; i++) {
			if (i < arr1.length && i < arr2.length) {
				arr[i] = arr1[i] + arr2[i];
			} else if (i < arr1.length) {
				arr[i] = arr1[i];
			} else {
				arr[i] = arr2[i];
			}

		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();

	}

}
