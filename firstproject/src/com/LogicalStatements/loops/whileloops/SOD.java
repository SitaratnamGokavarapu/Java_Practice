package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class SOD {
	//Using recursion
	static long sumofdigits(long n) {
		int rem = 0;

		int sum = 0;

		while (n != 0) {
			rem = (int) (n % 10);
			n = n / 10;
			sum = sum + rem;
		}
		
		long temp=sum;
		if(temp>9) {
			return sumofdigits(temp);
		}
		else {
			if(sum==1) {
				System.out.println("Given number is a magic number.");
			}
			else {
				System.out.println("Given number is not a magic number.");
			}
			return sum;
		}
		
	}
	//Using do-while
	static long sumofdigit(long n) {
	    do {
	    	long sum=0;
	    	while(n!=0) {
	    		sum+=n%10;
	    		n/=10;
	    	}
	    	n=sum;
	    }while(n>9);
	    return n;
	}
	//using while
	static long sod(long n) {
		long rem=0;
		while(n>9) {
			long sum=0;
			while(n!=0) {
				rem=n%10;
				n=n/10;
				sum=sum+rem;
			}
			n=sum;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long n=sc.nextInt();
		
		System.out.println("The sum of digits in given number is:"+sumofdigits(n));
//		System.out.println(sumofdigit(n));
//		System.out.println(sod(n));
		sc.close();
	}

}
