package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int num = X;
		int temp = 1;
		while (num != 0) {
			int rem = num % 10;
			temp = X*rem;
			num = num / 10;
		}
		if (temp == X) {
			System.out.println(X + " is a seed of " + Y);
		} else {
			System.out.println(X + " is not a seed of " + Y);
		}

	}

}
