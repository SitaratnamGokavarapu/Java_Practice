package com.casestudies;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 value:");
		int n1=sc.nextInt();//user input1
		System.out.println("Enter n2 value:");
		int n2=sc.nextInt();//user input2
		System.out.println("Enter your choice:");
		String choice=sc.next();
		switch(choice) {
		case "+" ->{
			System.out.println("Sum of "+n1+" and "+n2+" is : " +(n1+n2));
		}
		case "-" ->{
			System.out.println("Difference of "+n1+" and "+n2+" is : " +(n1-n2));
		}
		case "*" ->{
			System.out.println("Product of "+n1+" and "+n2+" is : " +(n1*n2));
		}
		case "/" ->{
			System.out.println("Division of "+n1+" and "+n2+" is : " +(n1/n2));
		}
		default->System.out.println("Invalid choice!!!");
		}
		sc.close();
	}

}
