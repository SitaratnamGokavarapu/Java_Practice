package com.LogicalStatements.loops;

import java.util.Scanner;

public class PerfectNumber1 {

	static void Perfectnumbers(int n) {

		
		int perf_no = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
				
			}
			if (sum == i) {
				System.out.println(i);
				perf_no =perf_no+1;
			}
		}
		System.out.println("perfect numbers:" + perf_no);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		Perfectnumbers(n);
		sc.close();
	}

}
