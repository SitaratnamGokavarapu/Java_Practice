package com.arrays;

import java.util.Scanner;

public class Digit_Count_Array {

	public static void main(String[] args) {
//		int[] arr= {1,11,13,154};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");//
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		String arr1[] = new String[size];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (arr[i] > 0) {
				int num = arr[i];
				while (num != 0) {
					num = num / 10;
					count++;
				}
			}
//			arr[i] = (arr[i] * 10) + count;
			arr1[i] = arr[i] + "" + count;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

//		for(String i:arr1) {
//			System.out.println(i);
//		}
     
		sc.close();
	}
}
