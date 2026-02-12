package com.LogicalStatements.loops;

import java.util.Scanner;

public class AlternatePrime {
	
	static boolean AltPrime(int a) {
		boolean flag=true;
		
		if(a==0||a==1) {
			return false;
		}
		//using math.sqrt()
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
//		for(int i=2;i<a;i++) {
//			if(a%i==0) {
//				flag=false;
//				break;
//			}
//		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value:");
		int a=sc.nextInt();
		int count=0;
		System.out.println("Even Alternate ");
		for(int i=1;i<=a;i++) {
			if(AltPrime(i)) {
				count++;
			if(count%2==0) {
				System.out.println(i);
			}
			}
		}
		System.out.println("Odd Alternate ");
		int count1=0;
		for(int i=1;i<=a;i++) {
			if(AltPrime(i)) {
				count1++;
			if(count1%2!=0) {
				System.out.println(i);
			}
			}
		}	
		
		sc.close();
	}

}
