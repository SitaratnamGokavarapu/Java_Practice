package com.arrays;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");// 5 2 3 5 2 1 5
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// Using boolean array
//		boolean rep[] = new boolean[arr.length];// f f f t f f f
//		for (int i = 0; i < size - 1; i++) {
//
//			if (rep[i]) {
//				continue;
//			}
//			int count = 0;
//
//			for (int j = i + 1; j < size; j++) {
//				if (arr[i] == arr[j]) {
//					count += 1;
//					rep[j] = true;
//				}
//			}
//			if (count > 0) {
//				System.out.println(arr[i]);
//			}
//		}
		// using sorting with one for loop
//		for(int i=0;i<size-1;i++) {
//			if(arr[i]>arr[i+1]) {
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[i+1]=temp;
//				
//				i=-1;
//			}
//		}
		// sorting using two loops
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println();
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
			}
			while (i < size - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
		}
		sc.close();
	}

}
