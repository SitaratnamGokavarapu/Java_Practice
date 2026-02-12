package com.javafundamentals;

public class Sample {
	static byte b;
	byte B;
	void display(){
		System.out.println(B);
		Display();
	}
	static void Display() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.display();
	}

}
