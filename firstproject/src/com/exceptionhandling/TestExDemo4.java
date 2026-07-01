package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
		}catch(Exception e) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in finally");

		}
		
		
		System.out.println("main method ended");
	}

}
