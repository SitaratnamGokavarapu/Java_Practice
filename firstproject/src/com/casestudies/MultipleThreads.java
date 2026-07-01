package com.casestudies;

class Thread3 implements Runnable{

	@Override
	public void run() {
		for(int i=33;i<=47;i++) {
			System.out.println((char)i);
		}
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
		}
	}
}
class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
}
public class MultipleThreads{

	public static void main(String[] args) {
		Thread1 t2=new Thread1();
		Thread t3=new Thread(t2);
		t3.start();
		Thread2 t4=new Thread2();
		Thread t5=new Thread(t4);
		t5.start();
		Thread3 t6=new Thread3();
		Thread t7=new Thread(t6);
		t7.start();
	}

}
