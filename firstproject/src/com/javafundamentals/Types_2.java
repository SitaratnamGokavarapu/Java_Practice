package com.javafundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Types_2 {
	String name="Navya";
	
	Integer i=1000;
	Character c='A';
	Long l=8554654246L;
	
	
	
	
	BigInteger bi1=new BigInteger("55476563359393");
	BigInteger bi2=new BigInteger("55476563359393");
	BigInteger bi3=bi1.add(bi2);
	BigInteger bi4=new BigInteger("55476563359393");

	BigInteger bi5=new BigInteger("85454545854885414523417935847892516549465478787987987546556348749856563458499856");
	
	long bi6 = bi5.longValue();
	int bi7 = bi5.intValue();
	float bi8 = bi5.floatValue();
	double bi9= bi5.doubleValue();
	//short bi10= bi5.shortValueExact();
	short bi11 = bi5.shortValue();
	
	BigDecimal bd1 = new BigDecimal("12890547864798896");
	BigDecimal bd2 = new BigDecimal("12890547864798896");
	
	BigDecimal bd3=bd2.add(bd1);
	long bd9=bd1.longValue();
	int bd4=bd1.intValue();
	float bd5=bd1.floatValue();
	double bd6=bd1.doubleValue();
	short bd7=bd1.shortValue();
	//byte bd8=bd1.byteValueExact();
	
	public static void main(String[] args) {
		Types_2 t=new Types_2();
		
		System.out.println(t.name);
		System.out.println(t.i);
		System.out.println(t.c);
		System.out.println(t.l);
		System.out.println(t.bi1);
		System.out.println(t.bd1);
		
		System.out.println("**** Coversions******");
		System.out.println(t.bi6);
		System.out.println(t.bi7);
		System.out.println(t.bi8);
		System.out.println(t.bi9);
		//System.out.println(t.bi10);
		System.out.println(t.bi11);
		
		System.out.println(" ***** Big Integer Operations ****");
		System.out.println(t.bi1.add(t.bi2));
		System.out.println(t.bi1.multiply(t.bi2));
		System.out.println(t.bi1.divide(t.bi2));
		System.out.println(t.bi1.subtract(t.bi2));
		System.out.println(t.bi1.mod(t.bi2));
		
		
		System.out.println(t.bi4.subtract(t.bi3));
		
		System.out.println(" ***** Big Decimal Operations ****");
		System.out.println(t.bd1.add(t.bd2));
		System.out.println(t.bd1.multiply(t.bd2));
		System.out.println(t.bd1.divide(t.bd2));
		System.out.println(t.bd1.subtract(t.bd2));
		System.out.println(t.bd1.divideToIntegralValue(t.bd2));
		
		System.out.println(t.bd9);
	}

}
