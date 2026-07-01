package com.exceptionhandling;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}catch(Exception e) {
			System.err.println("Tn catch of E");
		}
//			Unreachable catch block for ArithmeticException. 
//			It is already handled by the catch block for Exception
//		catch(ArithmeticException ae) {
//			System.err.println("Tn catch of AE");
//		}
	}

}
