package com.multithreading;

public class NumbersUsingInterface implements Runnable{

	public static void main(String[] args) {
		NumbersUsingInterface n=new NumbersUsingInterface();
		Thread t=new Thread(n);
		t.start();
	}

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}

}
