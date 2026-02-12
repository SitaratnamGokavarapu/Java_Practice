package com.operators;

import java.util.Scanner;

public class SwapwithXOR {
	
	static void swap(int x,int y) {
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		swap(a,b);
		sc.close();
	}

}
