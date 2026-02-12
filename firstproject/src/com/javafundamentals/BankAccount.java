package com.javafundamentals;
// two classes in the same file 

//class Bank {
//	String accountHolderName;
//	long accountNumber;
//	String password;
//	double balance;
//
//	void CreateAccount(String name, long accNo, String pwd, double bal) {
//		this.accountHolderName = name;
//		this.accountNumber = accNo;
//		this.password = pwd;
//		this.balance = bal;
//	}
//
//	double deposit(double amount) {
//		balance = balance + amount;
//		return balance;
//	}
//
//	double withdraw(double amount) {
//		balance = balance - amount;
//		return balance;
//	}
//
//	static void balanceEnquiry(Bank acc) {
//		System.out.println(acc.balance);
//	}
//}

public class BankAccount {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.CreateAccount("Navya", 23456789L, "Navya135", 100000);
		System.out.println("After Deposit, Balance is:" + b.deposit(2000));

		System.out.println("After Withdraw,Balance is:" + b.withdraw(1000));

		Bank.balanceEnquiry(b);

	}

}
