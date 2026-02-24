package com.arrays;

import java.util.Arrays;

public class Merge_Arrays {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		int arr1[] = { 4, 5, 6, 7 };
		int index=arr.length + arr1.length;
		int arr2[] = new int[index];
		
			for(int j=0;j<arr.length;j++) {
				arr2[j]=arr[j];
				
			}
			int a=0;
			for(int k=arr.length;k<index;k++) {
				arr2[k]=arr1[a];
				a++;
			}
		
		System.out.println(Arrays.toString(arr2));

	}

}
