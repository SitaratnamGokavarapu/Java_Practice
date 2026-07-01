package com.exceptionhandling;

import java.util.Scanner;

//throws keyword
public class TestExDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		
		if(b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("Don't send zeros");
		}
	}

}
