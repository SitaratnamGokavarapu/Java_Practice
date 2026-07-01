package com.multithreading;

//class TwoTable extends Thread {
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("2 *" + i + " = " + 2 * i);
//		}
//	}
//}
//
//class ThreeTable extends Thread {
//	TwoTable t1;
//
//	ThreeTable(TwoTable t1) {
//		this.t1 = t1;
//	}
//
//	public void run() {
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		for (int i = 1; i < 11; i++) {
//			System.out.println("3 *" + i + " = " + Math.multiplyExact(3, i));
//		}
//	}
//}
//
//class FiveTable extends Thread {
//	ThreeTable t2;
//
//	FiveTable(ThreeTable t2) {
//		this.t2 = t2;
//	}
//
//	public void run() {
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("5 *" + i + " = " + 5 * i);
//		}
//	}
//}

//public class Table_Threads extends Thread {
//
//	public static void main(String[] args) {
//		TwoTable t1 = new TwoTable();
//		t1.start();
//		ThreeTable t2 = new ThreeTable(t1);
//		t2.start();
//		FiveTable f = new FiveTable(t2);
//		f.start();
//	}
//
//}
class TwoTable implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 *" + i + " = " + 2 * i);
		}
	}
}
public class Table_Threads implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Thread t2=new Thread(new TwoTable());
		t2.start();
		Thread t4=new Thread(()->{
			try {
				t2.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 1; i <= 10; i++) {
				System.out.println("3 *" + i + " = " + 3 * i);
			}
		});
		t4.start();
//		FiveTable f = new FiveTable(t2);
//		f.start();
	}

}