package com.LogicalStatements.loops;

import java.util.Scanner;

public class Factorial {
	//without recursion
	static long FindFact(long n) {
		long fact=1;
		for(long i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		long f = FindFact(n);
		System.out.println("Factorial of given number " + n + " is: " + f);
		sc.close();
	}
//Using recursion
//	private static int FindFact(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n*FindFact(n-1);
//	}

}
