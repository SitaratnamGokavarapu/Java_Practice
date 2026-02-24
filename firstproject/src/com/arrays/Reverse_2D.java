package com.arrays;

import java.util.Scanner;

public class Reverse_2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size1:");
		int size1 = sc.nextInt();
		System.out.println("Enter Size2:");
		int size2 = sc.nextInt();
		int[][] arr = new int[size1][size2];
		System.out.println("Enter elements:");

		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Your array is:");
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Your transposed array is:");
		for(int i=0;i<size1;i++) {
			for(int j=i;j<size2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for (int i = 0; i < size2; i++) {
			for (int j = 0; j < size1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Your reversed array is:");
		
		for (int i = 0; i <size2; i++) {
			for (int j = size1-1; j>=0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
