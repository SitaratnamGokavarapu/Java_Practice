package com.LogicalStatements.loops;

import java.util.Scanner;
// at nth-position and series too...
public class Fibonacci {
	static int Fib(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1 +" "+ n2);
		for(int i=0;i<n-2;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		return n3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number position u want to find..? ");
		int n=sc.nextInt();
		int f=Fib(n);
		System.out.println();
		System.out.println("The number in the fibonacci series at position "+n+" is:"+f);
		
		sc.close();
	}

}
