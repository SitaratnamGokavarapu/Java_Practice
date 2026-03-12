package com.casestudies;

import java.util.Scanner;

public class Personal_Loan_Banking {
	Scanner sc = new Scanner(System.in);

	String getCustomerName() {
		System.out.println("Enter Your Name:");
		String Cust_name = sc.nextLine();
		return Cust_name;
	}

	int getCustomerAge() {
		System.out.println("Enter Your age: ");
		return sc.nextInt();
	}

	double getCustomerSalary() {
		System.out.println("Enter the Salary: ");
		double Salary = sc.nextDouble();
		return Salary;
	}

	int getCibil() {
		System.out.println("Enter your cibil score :");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Personal_Loan_Banking p = new Personal_Loan_Banking();
		String cust_Name = p.getCustomerName();
		double salary = p.getCustomerSalary();
		int cust_Age = p.getCustomerAge();
		int cibil = p.getCibil();
		System.out.println("----------------Personal Loan Banking-----------------");
		System.out.println("-----------------Customer Details------------------");
		System.out.println("Customer Name:" + cust_Name);
		System.out.println("Customer Age:" + cust_Age);
		System.out.println("Customer Salary:" + salary);
		System.out.println("Customer cibil score:" + cibil);

		if (salary >= 500000 && cust_Age >= 21 && cibil > 750) {
			System.out.println("Congratulations!! Your loan is approved...!");
		} else {
			System.out.println("Sorry!!! Your Loan is Rejected....");
		}

	}

}
