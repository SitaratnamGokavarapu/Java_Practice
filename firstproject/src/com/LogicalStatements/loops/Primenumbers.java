package com.LogicalStatements.loops;

import java.util.Scanner;

public class Primenumbers {
	
	static void Primeno(int a) {
		boolean flag=true;
		if(a==0||a==1) {
			flag= false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			Primeno(i);
		}
		
		
		sc.close();
		
	}

}
