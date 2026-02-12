package com.operators;

public class Swap {
	int a;
	int b;
	void swap(int a,int b) {
		System.out.println(a);
		System.out.println(b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Swap s= new Swap();
		s.swap(10, 20);
	}

}
