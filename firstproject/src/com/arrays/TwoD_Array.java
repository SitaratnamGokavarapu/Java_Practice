package com.arrays;

import java.util.Scanner;

public class TwoD_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size1:");
		int size1=sc.nextInt();
		System.out.println("Enter Size2:");
		int size2=sc.nextInt();
		int[][] arr=new int[size1][size2];
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Your array is:");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Your Exchanged rows and columns: ");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
