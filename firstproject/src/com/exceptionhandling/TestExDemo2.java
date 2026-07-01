package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			System.out.println(10/0.0);//Infinity because of floating points follow strictfp
//			from java 17 strictfp is no need because keyword removed and as per IEEE standards these floating point follows and gives infinity
			System.out.println(0/0);//AR Exception
			System.out.println(0.0/0.0);//NaN
		}catch(Exception e) {
			System.err.println("in catch of ex");
		}
		System.out.println("main method ended");
	}

}
