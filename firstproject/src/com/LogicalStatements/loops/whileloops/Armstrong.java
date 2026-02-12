package com.LogicalStatements.loops.whileloops;

import java.util.Scanner;

public class Armstrong {
	static boolean FindArmstrong(int n) { 
		int r=0;
		int res=0;
		int temp=n;
		String s=Integer.toString(temp);
		int dc=s.length();
		while(n!=0) {
			r=n%10;
			n=n/10;
			res=(int) (res+Math.pow(r, dc));
		}
		if(res!=temp) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean as=FindArmstrong(n);
		if(as) {
			System.out.println(n+" is a Armstrong number..! ");
		}
		else {
			System.out.println(n+" is not a Armstrong number..! ");
		}
		
		sc.close();
	}

}
