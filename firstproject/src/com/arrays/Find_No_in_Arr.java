package com.arrays;

import java.util.Scanner;

public class Find_No_in_Arr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			while(arr[i]!=0) {
				int rem=arr[i]%10;//123%10=3,12%10=2,1%10=1
				if(rem==target) {
					count++;//1
				}
				arr[i]=arr[i]/10;//123/10=12,12/10=1,1/10=0
			}
		}
		System.out.println(count);
		sc.close();
	}

}
