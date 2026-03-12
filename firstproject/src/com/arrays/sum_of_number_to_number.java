package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

//input:{12,34,31,54}
//output:{123,347,314,549}


public class sum_of_number_to_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {12,34,31,54};
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int sum=0;
			while(num!=0) {
				int rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			arr[i]=arr[i]*10+sum;
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
