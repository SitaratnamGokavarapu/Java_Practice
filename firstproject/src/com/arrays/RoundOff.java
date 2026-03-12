 package com.arrays;

import java.util.Arrays;

public class RoundOff {

	public static void main(String[] args) {
		int[] arr= {26,30,55,56,39,23};
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int rem=num%10;
			if(rem>5) {
				arr[i]+=10-rem;
			}
			else {
				arr[i]= arr[i]-rem;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
