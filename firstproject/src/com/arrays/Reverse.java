package com.arrays;

public class Reverse {

	public static void main(String[] args) {
		int arr[]= {5,8,3,9,7};
		int start=0;
		int end=arr.length-1;
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
