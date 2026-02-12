package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Strongnumber {

	static boolean isStrong(int n) {
		int rem = 0;
		int value = 0;
		int temp = n;

		while (n != 0) {
			int fact = 1;// 145
			rem = n % 10;// 145%10=5,14%10=4,1%10=1
			n = n / 10;// 145/10=14,14/10=1,1/10=0
			for (int i = rem; i >= 1; i--) {
				fact = fact * i;
			}
			value = value + fact;// 120+24+1=145
			//Using method
			//value = value + fact(rem);
		}
		if (temp == value) {
			return true;
		}
		return false;
	}
	//using method
	static int fact(int m) {
		int fact = 1;
		for (int i = m; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ..?");
		int n = sc.nextInt();

		boolean s = isStrong(n);
		if (s) {
			System.out.println("Given number is a Strong number!!");
		} else {
			System.out.println("Given number is not a Strong number!!");

		}
		sc.close();
	}

}
