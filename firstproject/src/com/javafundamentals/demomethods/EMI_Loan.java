package com.javafundamentals.demomethods;

import java.util.Scanner;

public class EMI_Loan {
	static Scanner sc = new Scanner(System.in);

	long AccountNumber() {
		long accno = sc.nextLong();
		if (accno < 1000) {
			System.out.println("Account number should contain 4 digits and must start with 1 only");
		}
		return accno;
	}

	double salary() {
		return sc.nextDouble();
	}

	double AccountBalance() {
		double balance = sc.nextDouble();
		if (balance < 1000.00) {
			System.out.println("Minimum Balance should not be less than 1000");
		}
		return balance;
	}

	String Loan_Type() {
		return sc.next();
	}

	long Exp_Loan_Amount() {
		return sc.nextLong();
	}

	int number_of_emi() {
		return sc.nextInt();
	}

	public static void main(String[] args) {
		EMI_Loan e = new EMI_Loan();
		System.out.println("accountNumber=");
		long acc_no = e.AccountNumber();
		System.out.println("salary=");
		double salary = e.salary();
		System.out.println("accountBalance=");
		double balance = e.AccountBalance();
		System.out.println("loanType=");
		String loan_type = e.Loan_Type();
		System.out.println("loanAmountExpected=");
		double exp_loan = e.Exp_Loan_Amount();
		System.out.println("emisExpected=");
		int emis = e.number_of_emi();
		if (salary > 25000 && loan_type.equalsIgnoreCase("car")&& emis <= 36) {
			System.out.println("AccountNumber=" + acc_no);
			System.out.println("eligibleLoanAmount=500000");
			System.out.println("RequestedLoanAmount=" + exp_loan);
			System.out.println("eligibleEmis=36");
		} else if (salary > 50000 && loan_type.equalsIgnoreCase("house") && emis <= 60) {
			System.out.println("AccountNumber=" + acc_no);
			System.out.println("eligibleLoanAmount=6000000");
			System.out.println("RequestedLoanAmount=" + exp_loan);
			System.out.println("eligibleEmis=60");
		} else if (salary > 75000 && loan_type.equalsIgnoreCase("business") && emis <= 84) {
			System.out.println("AccountNumber=" + acc_no);
			System.out.println("eligibleLoanAmount=7500000");
			System.out.println("RequestedLoanAmount=" + exp_loan);
			System.out.println("eligibleEmis=84");
		} else {
			System.out.println("Your Criteria didnt meet the bank Requirements.");
		}
	}
}
