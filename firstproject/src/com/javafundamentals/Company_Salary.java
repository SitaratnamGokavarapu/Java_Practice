package com.javafundamentals;

public class Company_Salary {
	Double month_salary= 5000D;
	
	Double Daily_Allow() {
		Double Daily_Allowance=(month_salary*0.08);
		System.out.println("Daily Allowance of Employee:"+Daily_Allowance);
		return Daily_Allowance;
	}
	Double PF_Ded() {
		Double Provident_Fund=(month_salary*0.03);
		System.out.println("Provident Fund of Employee:" +Provident_Fund);
		return Provident_Fund;
	}
	Double CGST_Ded() {
		Double CGST=(month_salary*0.07);
		System.out.println("CGST of Employee:" + CGST);
		return CGST;
	}
	Double Net_Annual_Salary() {
		Double total_salary=month_salary+Daily_Allow()-PF_Ded()-CGST_Ded();
		System.out.println("Monthly Salary: "+ total_salary);
		System.out.println("Annual Salary: "+ total_salary*12);
		return total_salary;
	}
	public static void main(String[] args) {
		Company_Salary c=new Company_Salary();
		c.Net_Annual_Salary();
	}

}
