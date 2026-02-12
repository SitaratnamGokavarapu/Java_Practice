package com.javafundamentals;

public class variables_1 {
	static double salary=10000;
	static double travel_allowance() {
		double t_a=salary*0.12;
		double int_allow=salary*0.03;
		double total_allowance=t_a+int_allow;
		System.out.println("Travel Allowance: "+t_a);
		System.out.println("Internet Allowance: "+int_allow);
		return total_allowance;
	}
	double Insurance() {
		double ins_ded=salary*0.02;
		System.out.println("Insurance Deduction: "+ ins_ded);
		return ins_ded;
	}
	double Net_salary() {
		double netsalary=salary+travel_allowance()-Insurance();
		System.out.println("Net Salary: "+netsalary);
		return netsalary;
	}
	public static void main(String[] args) {
		variables_1 v=new variables_1();
		v.Net_salary();
		
	}

}
