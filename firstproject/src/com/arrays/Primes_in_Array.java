package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Primes_in_Array {
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int k=0;k<size;k++) {
			if(isPrime(arr[k])) {
				count++;
			}
		}
		int [] newArr = new int[count]; 
		int i=0;
		for(int j=0;j<size;j++) {
			if(isPrime(arr[j])) {
				newArr[i]=arr[j];
				i++;
			}
			else {
				System.out.println("0");
			}
		}
//		System.out.println(Arrays.toString(newArr));
		System.out.print("{");
		for(int l=0;l<newArr.length;l++) {
			System.out.print(newArr[l]);
			if(l<newArr.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");

		sc.close();
	}

}
