package com.multithreading;

class Odd extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
				System.out.println("Odd: "+i);
			}
		}
	}
}
public class EvenOdd extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("Even: "+i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		EvenOdd eo=new EvenOdd();
		eo.start();
		Odd o=new Odd();
		o.start();
		
	}

}
