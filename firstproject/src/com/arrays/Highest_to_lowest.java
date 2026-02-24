package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Highest_to_lowest {

	static void Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target for addition:");
		int target = sc.nextInt();
		
//		Sort(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					continue;
				}
				if(target==arr[i]+arr[j]) {
					System.out.println("["+arr[i]+","+arr[j]+"]");
				}
			}
		}

		
		sc.close();
	}

}
