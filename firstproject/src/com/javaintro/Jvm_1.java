package com.javaintro;

public class Jvm_1 {
	public static void main(String[] args) throws ClassNotFoundException{

		System.out.println("Loading Begins!!!");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Completed Successfully...!");
	}
}
