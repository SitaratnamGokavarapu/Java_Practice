package com.javafundamentals;

import java.math.*;

public class Company_Salary_1 {
	BigDecimal month_salary=new BigDecimal("5000");
	
	BigDecimal Daily_Allow() {
		BigDecimal Interest=new BigDecimal("0.08");
		BigDecimal D_A=month_salary.multiply(Interest);
		return D_A;
	}
	BigDecimal PF_Ded() {
		BigDecimal PF_Ded=new BigDecimal("0.03");
		BigDecimal P_F=month_salary.multiply(PF_Ded);
		return P_F;
	}
	
	BigDecimal CGST() {
		BigDecimal CGST_DED=new BigDecimal("0.07");
		BigDecimal C_GST=month_salary.multiply(CGST_DED);
		return C_GST;
	}
	BigDecimal Net_Monthly_Salary() {
		BigDecimal netMonthly = month_salary.add(Daily_Allow()).subtract(PF_Ded()).subtract(CGST());
	    System.out.println("Net Monthly Salary : " + netMonthly);
	    System.out.println("Net Annually Salary : " + netMonthly.multiply(new BigDecimal("12")));
		return netMonthly;
	}
	public static void main(String[] args) {
		Company_Salary_1 c1=new Company_Salary_1();
		c1.Net_Monthly_Salary();
	}

}
