package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Zeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		boolean[]r=new boolean[arr.length];
		boolean[]c=new boolean[arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					r[i]=true;
					c[j]=true;
					}
				}
			}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(r[i]||c[j]) {
					arr[i][j]=0;
				}
			}
		}
		sc.close();
		System.out.println(Arrays.deepToString(arr));
	}

}
