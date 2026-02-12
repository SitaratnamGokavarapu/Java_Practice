package com.arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		//with string type
//		String[] arr;
//		arr = new String[size];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.next();
//			System.out.println(arr[i]);
//		}
//		for (String a : arr) {
//			System.out.println(a);
//
//		}
		//with char data type
		char[] a1=new char[size];
		a1[0]='h';
		for(int i=0;i<size;i++) {
			a1[i]=sc.next().charAt(0);
			System.out.println("'"+a1[i]+"'");
		}
		sc.close();
	}

}
