package com.LogicalStatements.loops;

import java.util.Scanner;

public class PrimeorNot {
	static boolean isPrime(int a) {
		boolean status=true;
		if(a==0||a==1) {
			return false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		sc.close();
	}

}
