package com.casestudies;

import java.util.Arrays;
import java.util.Scanner;

public class Students_Marks_Processing_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of records of Students:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the marks of " + n + " Students:");
		int i = 0;
		while (i < n) {
			arr[i] = sc.nextInt();
			i++;
		}
		int min = arr[0];
		int max = arr[0];
		int total_marks = 0;
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < n; j++) {
			if (arr[j] < min) {
				min = arr[j];
			} else if (arr[j] > max) {
				max = arr[j];
				
			}
			total_marks += arr[j];
		}
		double average = total_marks / n;
		System.out.println("The Highest mark is:" + max);
		System.out.println("The Lowest mark is:" + min);
		System.out.println("Average of total marks:" + average);
	}

}
