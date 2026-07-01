package com.multithreading;

public class NumbersUsingSleep implements Runnable{

	public static void main(String[] args) {
		Thread t=new Thread(new NumbersUsingSleep());
		t.start();
		t.interrupt();
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted!"); 
			}
		}
	}

}
