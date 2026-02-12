package com.javaintro;

public class Blocks {
	static {
		System.out.println("Static Block1");
	}
	static {
		System.out.println("Static Block2");
	}
	{
		System.out.println("Instance Block");
	}
	void Finalize() {
		System.out.println("Finally Done");
	}
	public static void main(String[] args) {
//		Blocks b= new Blocks();
	}

}
