package com.arrays;

import java.util.Scanner;

public class OddandEvenSqpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] * arr[i];
			} else{
				arr[i] = arr[i] * 2;
			}
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
