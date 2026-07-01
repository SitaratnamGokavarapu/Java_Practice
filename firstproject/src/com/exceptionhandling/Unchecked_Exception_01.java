package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked_Exception_01 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int a = sc.nextInt();

			System.out.println("Enter b number: ");
			int b = sc.nextInt();

			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("Exception in AR");
			e.printStackTrace();
		}catch (InputMismatchException e1) {
			System.err.println("Exception in Input");
			e1.printStackTrace();
		}
		System.out.println("main method ended!!");
	}

}
