package com.LogicalStatements.loops;

import java.util.Scanner;

public class IsPerfect {
	boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if(sum==n) {
			flag=true;
		}
		if(flag) {
			System.out.println("The given number " + n + " is perfect number.");
		}
		else {
			System.out.println("The given number " + n + " is not a perfect number.");
		}
//		if (n == sum) {
//			System.out.println("The given number " + n + " is perfect number.");
//		} else {
//			System.out.println("The given number " + n + " is not a perfect number.");
//		}
		return flag;
	}

	public static void main(String[] args) {
		IsPerfect i1 = new IsPerfect();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		i1.isPerfect(n);
		sc.close();
	}

}
