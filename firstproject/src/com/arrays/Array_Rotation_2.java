package com.arrays;

import java.util.Scanner;

public class Array_Rotation_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= { 13, 7, 9, 20, 10, 19, 7};
		int start=0;
		int end=arr.length;
		int r=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			reverse(arr[i],0,r-1);
			reverse(arr[i],r,end);
		}
		
	}

	private static void reverse(int arr,int start,int end) {
		
	}

}
