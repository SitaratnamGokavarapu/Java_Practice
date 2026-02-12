package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;
//Decimal to binary
public class Conversion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
//Using defined methods 	
//		String s=Integer.toBinaryString(num);
		String s1=" ";
		
		while(num!=0) {
			rem=num%2;
			num=num/2;
			s1=rem+s1;
		}
//		System.out.println(s);
		System.out.println(s1);
		sc.close();
	}

}
