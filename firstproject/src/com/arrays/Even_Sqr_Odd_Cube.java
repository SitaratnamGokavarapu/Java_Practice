package com.arrays;

import java.util.Arrays;

public class Even_Sqr_Odd_Cube {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 9 };
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] *= arr[i];
			} else {
				arr[i] = arr[i] * arr[i] * arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
