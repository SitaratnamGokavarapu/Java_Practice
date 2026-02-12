package com.javafundamentals.constuctors;

public class Weekend_Exam_Q {
	
	public Weekend_Exam_Q() {
		int a=10;
		System.out.println("Constructor Called:"+a);
	}
	void show() {
		int a=20;
		System.out.println("Method Called:"+a);
	}
	public static void main(String[] args) {
		Weekend_Exam_Q w=new Weekend_Exam_Q();
		w.show();
		
	}

}
