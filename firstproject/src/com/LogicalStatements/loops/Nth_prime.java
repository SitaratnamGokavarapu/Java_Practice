package com.LogicalStatements.loops;

import java.util.Scanner;

public class Nth_prime {
	
	static boolean Primepos(int n) {
		boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the upper limit range ..?");
		int n=sc.nextInt();
		System.out.println("Enter the prime position u want..?");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(Primepos(i)) {
				count++;
				if(count==a) {
					System.out.println("Your prime at position-"+count+" is: "+ i);
				}
			}
		}
		sc.close();
	}

}
