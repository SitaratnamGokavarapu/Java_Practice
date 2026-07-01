package com.exceptionhandling;

public class TestExDemo5 {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			return;
//			System.exit(1);
		}finally {
			System.out.println("in finally");
		}
	}

}
