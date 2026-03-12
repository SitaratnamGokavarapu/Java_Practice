package com.arrays;

import java.util.Scanner;

public class Roots {
	void discriminant(int a,int b,int c) {
		int disc=(b*b)-(4*a*c);
		double r1 = (-b+disc)/(2*a);
		double r2 = (-b-disc)/(2*a);
		if(disc==0) {
			System.out.println("The root is "+ r1);;
		}else if(disc>0) {
			System.out.println(r1);
			System.out.println(r2);
		}else {
			System.out.println("The Equation has no real roots");
		}
	}
	public static void main(String[] args) {
		Roots r=new Roots();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		r.discriminant(a, b, c);
		
		sc.close();
	}

}
