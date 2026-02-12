package com.LogicalStatements.loops;

import java.util.Scanner;

public class Prime_SQRT {
	static boolean Primesqrt(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(Primesqrt(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
