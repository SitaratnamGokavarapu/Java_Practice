package com.casestudies;

import java.util.Scanner;

public class Payment {
	Scanner sc=new Scanner(System.in);
	void Payment() {
		System.out.println("Payment Processing");
	}
}
class Creditcard extends Payment {
	void Payment() {
		System.out.println("Payment Processing Using Credit Card!");
	}
}
class Debit extends Payment{
	void Payment() {
		System.out.println("Payment Processing Using Debit Card!");
	}
}
class UPI extends Payment{
	void Payment() {
		System.out.println("Payment Processing Using UPI!");
	}
}
