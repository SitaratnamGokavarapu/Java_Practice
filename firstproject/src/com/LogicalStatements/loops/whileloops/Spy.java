package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Spy {

	static int sum(int num) {
		int rem = 0;
		int sum = 0;
		for (int i = num; i > 0;) {
			rem = i % 10;// 123%10=3,12%10=2,1%10=1
			i = i / 10;
			sum = sum + rem;// 3+2+1=6
		}
		return sum;
	}

	static int product(int num) {
		int product = 1;
		int rem = 0;
		for (int i = num; i > 0;) {
			rem = i % 10;// 123%10=3,12%10=2
			i = i / 10;// 123/10=12,12/10=1
			product = product * rem;// 3*2*1=6
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
//		int a = sum(n);
//		int b = product(n);
		if(sum(n)==product(n)) {
//		if (a == b) {
			System.out.println("Spy number");
		} else {
			System.out.println("Not a spy number");
		}
		sc.close();
	}

}
