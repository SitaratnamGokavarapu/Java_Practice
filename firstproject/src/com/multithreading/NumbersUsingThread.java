package com.multithreading;

public class NumbersUsingThread extends Thread{

	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		NumbersUsingThread n=new NumbersUsingThread();
		n.start();
		
		
	}

}
