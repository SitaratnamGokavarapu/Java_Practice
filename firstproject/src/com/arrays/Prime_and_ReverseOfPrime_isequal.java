package com.arrays;

public class Prime_and_ReverseOfPrime_isequal {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0) {
				status = false;
				break;
			}
			i++;

		}
		return status;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 14, 13, 17, 21, 2, 4 };

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int temp = 0;
			if (isPrime(num)) {
				while (num != 0) {
					int rem = num % 10;
					num = num / 10;
					temp = temp * 10 + rem;
				}
				if (isPrime(temp)) {
					System.out.println(arr[i]);
				}
			}
			
		}

	}

}
