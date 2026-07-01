package com.multithreading;

class Thread1 implements Runnable {
	public void run() {
		System.out.println("Hello Thread2");
		System.out.println(Thread.currentThread());
	}
}
public class ThreadMessages extends Thread1 implements Runnable {

	public static void main(String[] args) {
		ThreadMessages t=new ThreadMessages();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println(Thread.currentThread());
		Thread1 t2=new Thread1();
		Thread t3=new Thread(t2);
		t3.start();
		
	}

	@Override
	public void run() {
		System.out.println("Hello Thread1");
		System.out.println(Thread.currentThread());
	}

}
