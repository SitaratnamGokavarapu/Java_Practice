package com.LogicalStatements.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int s=num;
		int rev=0;
		while(s!=0) {
			int rem=s%10;
			s=s/10;
			rev=rev*10+rem;
		}
		if(num==rev) {
			System.out.println(num +" is a palindrome.");
		}
		else {
			System.out.println(num+ " is not a palindrome.");
		}
	}

}
