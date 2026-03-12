package com.javafundamentals.demomethods;

public class Tester {
	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		if (num1 < num2) {
			int index = 0;
			for (int i = num1 + 1; i <= num2; i++) {
				int num = i;
				int sum = 0;
				while (num != 0) {
					int rem = num % 10;
					num = num / 10;
					sum = rem + sum;
				}
				if (sum % 3 == 0 && i % 5 == 0) {
					numbers[index] = i;
					index++;
				}
			}

		}
		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}
	}

}
