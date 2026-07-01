package com.nqt;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] list=sc.nextLine().split("[,\\s]+");
		
		int[] arr=new int[list.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(list[i]);
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0) {
				sum1=arr[i]+sum1;
			}else {
				sum2=arr[i]+sum2;
			}
		}
		System.out.println(sum1-sum2 );
		
		
	}

}
