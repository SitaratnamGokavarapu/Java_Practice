package com.LogicalStatements.loops;

import java.util.Scanner;

public class Prime1 {
	
	static boolean Primeno(int a) {
		boolean status=true;
		if(a==0||a==1) {
			return false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for (int i = 2; i <=n; i++) {
			if(Primeno(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
