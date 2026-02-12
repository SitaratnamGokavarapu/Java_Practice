package com.arrays;

public class Zeros_in_Arr {

	public static void main(String[] args) {
		int arr[] = { 0, 4, 5, 0, 6, 0, 0, 5, 2, 3 };
		//Here the elements order is going to be changed....
//		int start = 0;
//		int end = arr.length - 1;
//		int temp = 0;
//		while (start < end) {
//			if(arr[start]!=0) {
//				start++;
//			}else if(arr[end]==0) {
//				end--;
//			}
//			else {
//				temp = arr[start];
//				arr[start] = arr[end];
//				arr[end] = temp;
//				start++;
//				end--;
//			}
//
//		}
		//Here the elements are moved to the front in the same sequence.
		int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
