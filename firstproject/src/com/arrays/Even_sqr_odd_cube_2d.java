package com.arrays;

import java.util.Arrays;

public class Even_sqr_odd_cube_2d {

	public static void main(String[] args) {
		int[][] arr = { { 2, 4, 3 }, { 5, 8, 1 } };
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] *= arr[i][j];
				} else {
					arr[i][j] = arr[i][j] * arr[i][j] * arr[i][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
