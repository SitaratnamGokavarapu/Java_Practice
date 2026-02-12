package com.arrays;

import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int leader = arr[size - 1];
		System.out.print(leader + " ");
		for (int i = size - 1; i >= 0; i--) {

			if (arr[i] > leader) {
				leader = arr[i];
				System.out.print(leader + " ");
			}
		}
		sc.close();
	}

}
