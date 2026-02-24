package com.casestudies;

import java.util.Scanner;

import java.util.*;

public class Random_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int rand = r.nextInt(1, 10);
//		System.out.println("Enter your guess number in between 1 and 10 :");
//		int choice = sc.nextInt();
		int attempts = 0;
		while (attempts < 3) {
			System.out.println("Enter your guess: ");
			int choice = sc.nextInt();
			attempts++;
			if (choice == rand) {
				System.out.println("Congratulations!! You Won");
				break;
			} else if (attempts > 2) {
				System.out.println();
				System.out.println("Sorry!!Your guesses are not matched and Your Chances are exceeded..");
			} else if (choice > rand) {
				System.out.println("Your guess is greater than the generated number");
			} else {
				System.out.println("Your guess is less than the generated number");
			}

		}

		sc.close();
	}

}
