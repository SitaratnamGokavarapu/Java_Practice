package com.LogicalStatements.loops;

import java.util.Scanner;

public class CircularPrime {
	static boolean Primecir(int n) {
		boolean show=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				show=false;
				break;
			}
		}
		return show;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(Primecir(i)) {
				System.out.print(i+" ");
			}
		}
//		System.out.println("-------");
		for(int i=b;i>=a;i--) {
			if(Primecir(i)) {
				System.out.print(" "+i);
			}
		}
		
		sc.close();
	}

}
