package com.gut;

public class Q1 {
	int x = 0;
	static int count = 0;

	Q1() {

		count++;
		x++;
	}

//	void display() {
//		System.out.println("parent");
//		
//	}
	public static void main(String[] args) {
		Q1 t = new Q1();
		Q1 t1 = new Q1();
		
		System.out.println(count);
		System.out.println(t.x);
		System.out.println(t1.x);
		
	}

}