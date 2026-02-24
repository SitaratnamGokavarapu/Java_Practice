package com.arrays;

public class Most_Repetition_Find {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 1, 3, 2, 1 };
		int max_frequency = 0;
		int ele = 0;
		int second_max = 0;
		int second_min = 0;
		boolean[] arr1 = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr1[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr1[i] = true;
				}
			}
			if (count > max_frequency) {
				max_frequency = count;
				ele = arr[i];
			}

		}
		System.out.println("max repeated" + " " + ele);

	}

}
