package com.operators;

import java.util.Scanner;

public class Bitwise {
	
	static int a;
	static int b;
	
	void display() {
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a>>b);
		System.out.println(a<<b);
	}
	
	public static void main(String[] args) {
		Bitwise b1=new Bitwise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		
		b1.display();
		
		sc.close();
	}

}
