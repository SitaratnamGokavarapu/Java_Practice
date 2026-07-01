package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
//			System.out.println(1/0);
			int a=10/2;
			System.out.println("*******************");
//			String s=null;
//			System.out.println(s.length());
			String s="Navya";
			System.out.println(s.charAt(a));
		}catch(ArithmeticException ae) {
			System.err.println("in catch of AR");
			ae.getMessage();
		}catch(StringIndexOutOfBoundsException s) {
			System.err.println("in catch od SI");
			s.getMessage();
		}
//		catch(NullPointerException np) {
//			System.err.println("in catch of NP");
//			np.getMessage();
//		}
		System.out.println("main method ended");
	}

}
// if we have error in the try block then 
//the remaining statements wont get executed 
//and goes to the catch block 