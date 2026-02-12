package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Reverse {
	
	static int FindReverse(int num) {
		int rev=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be reversed..?");
		int n= sc.nextInt();
		int reverse=FindReverse(n);
		System.out.println("The reversed number of given number is: "+reverse);
		sc.close();
	}

}
