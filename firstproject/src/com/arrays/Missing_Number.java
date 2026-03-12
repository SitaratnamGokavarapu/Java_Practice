package com.arrays;

import java.util.Arrays;

public class Missing_Number {

	public static void main(String[] args) {
//		int[] arr = { 1, 3, 2, 6, 5 };
		int[] arr = { 1, 3, 4, 5, 9, 11, 15, 16, 20 };
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		int i = 0;
//		while (i < arr.length - 1) {
//			if (arr[i + 1] - arr[i] != 1) {
//				System.out.println(arr[i] + 1);
//			}
//
//			i++;
//		}
		int min = 0;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}

		}

		for (int i = min + 1; i < max; i++) {
			boolean np = true;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					np = false;
					break;
				}
			}

			if (np) {
				System.out.println(i);
			}

		}

	}

}
