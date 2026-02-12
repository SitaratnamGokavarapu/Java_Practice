package com.LogicalStatements.loops;

import java.util.Scanner;

public class Mathtable {
	
	static void Table(int a,int b) {
		for(int a1=1;a1<=b;a1++) {
			System.out.println(a+ " X "+b+" = "+a1*a);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the table u want :");
		int n=sc.nextInt();
		System.out.println("Enter the number of the table u want :");
		int stop=sc.nextInt();
//		for(int i=1;i<=stop;i++) {
//			System.out.println(n+ " X "+i+" = "+n*i);
//		}
		Table(n,stop);
		sc.close();
	}

}
