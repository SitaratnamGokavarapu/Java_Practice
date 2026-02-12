package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Armstrong1 {
	static boolean isArmstrong(int num) {
		int rem = 0;
		int temp = num;
		int count = 0;
		int sum = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		num=temp;
		while (temp != 0) {
			rem = temp % 10;
			int power = 1;
			int i = 1;
			while (i <= count) {
				power = power * rem;
				i++;
			}
			sum = sum + power;
			temp = temp / 10;
		}
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		if (isArmstrong(n)) {
			System.out.println(n + " is an Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}
		sc.close();
	}

}
