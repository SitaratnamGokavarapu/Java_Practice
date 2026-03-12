package com.arrays;

import java.util.Arrays;

// 9 2 1
// 8 100 12
// 81 8 49
public class Array_1 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				int start = 0;
				int end = arr[i].length - 1;
				while (start < end) {
					int temp = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = temp;
					start++;
					end--;
				}
			}
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 != 0) {
					arr[i][j] *= 2;
				}
				if (i == j || (j==arr[i].length-1-i)) {
					arr[i][j] *= arr[i][j];
				}
			}

		}
		System.out.println(Arrays.deepToString(arr));
	}
}
