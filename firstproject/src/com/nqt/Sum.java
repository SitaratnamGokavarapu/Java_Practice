package com.nqt;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int input=sc.nextInt();
//		sc.nextLine();
//		String[] arr=sc.nextLine().split("[,\\s]+");
//		int[] arr1=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			arr1[i]=Integer.parseInt(arr[i]);
//		}
//		int count=0;
//		for(int i=0;i<arr1.length;i++) {
//			if(arr1[i]%2==0 && arr1[i]>=input) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		sc.nextLine();
//		String[] list=sc.nextLine().split("[,\\s]+");
//		int[] arr=new int[n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=Integer.parseInt(list[i]);
//		}
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2!=0) {
//				sum=sum+arr[i];
//			}
//		}
//		System.out.println(sum);
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] list=sc.nextLine().split("[,\\s]+");
		int[] arr=new int[list.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(list[i]);
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=n && arr[i]%2==0 && arr[i]%5!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
