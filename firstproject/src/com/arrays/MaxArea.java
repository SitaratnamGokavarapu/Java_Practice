package com.arrays;

import java.util.Scanner;

public class MaxArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//		int arr[] = { 2, 3, 1, 5, 6, 4, 8, 7 };
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int j = i + 1;
			while (j < arr.length) {

				if (arr[i] <= arr[j]) {
					count++;
					j++;
				} else {
					break;
				}

			}
			int k = i - 1;
			while (k >= 0) {

				if (arr[i] <= arr[k]) {
					count++;
					k--;
				} else {
					break;
				}

			}
			System.out.println(arr[i] * count);
		}

	}

}
