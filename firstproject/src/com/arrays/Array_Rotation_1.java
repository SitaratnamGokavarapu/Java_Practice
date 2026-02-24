package com.arrays;

import java.util.Arrays;

public class Array_Rotation_1 {

	public static void main(String[] args) {
		int[] arr = { 13, 7, 9, 20, 10, 19, 7 };
		int middle = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr.length) % 2 == 0) {
				middle = arr.length / 2;
			} else {
				middle = (arr.length / 2) + 1;
			}
		}
		for (int i = 0; i < middle - 1; i++) {
			for (int j = i + 1; j < middle - 1; j++) {
				if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		for (int i = middle; i < arr.length; i++) {
			for (int j = middle; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
