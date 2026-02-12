package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

//Binary to  Decimal
public class Conversion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		String num = sc.next();
		int s = Integer.parseInt(num);
		int rem = 0;
		int res = 0;
		int power = 1;
		while (s != 0) {
			rem = s % 10;
			res = res + rem * power;
			power = power * 2;
			s = s / 10;
		}
		System.out.println(res);
//		System.out.println(s1);
		sc.close();
	}

}
