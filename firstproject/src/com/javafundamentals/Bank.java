package com.javafundamentals;

public class Bank {
	String accountHolderName;
	long accountNumber;
	String password;
	double balance;

	void CreateAccount(String name, long accNo, String pwd, double bal) {
		this.accountHolderName = name;
		this.accountNumber = accNo;
		this.password = pwd;
		this.balance = bal;
	}

	double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	static void balanceEnquiry(Bank acc) {
		System.out.println("Account Holder Name: " + acc.accountHolderName);
		System.out.println("Final Balance: " + acc.balance);
	}

	public static void main(String[] args) {

	}

}
