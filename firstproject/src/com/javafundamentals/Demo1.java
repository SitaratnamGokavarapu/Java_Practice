package com.javafundamentals;

public class Demo1 {
	static byte grp_cnt=10;
	byte Grp_cnt;
	static int age=18;
	int Age;
	static short code=91;
	short Code;
	static long phn=9676007370L;
	long Phn;
	static float cgp=8.3f;
	float Cgp;
	static double percent=75.50;
	double Percent;
	static char blood_type='B';
	char Blood_type;
	static boolean gender=true;
	boolean Gender;
	static{
		System.out.println(age);
	}
	{
		//Here it gives u stack overflow because whenever the object is created the instance block will be called So that here in instance block we created object so it runs in a loop. 
		Demo1 d=new Demo1();
		d.Age=6;
		System.out.println(d.Age);
	}
	void Display(){
		System.out.println("Instance Variables!!!");
		System.out.println("Grp_cnt:"+Grp_cnt);
		System.out.println("Age:"+Age);
		System.out.println("Code:"+Code);
		System.out.println("Phn:"+Phn);
		System.out.println("Cgp:"+Cgp);
		System.out.println("Percent:"+Percent);
		System.out.println("Blood_type:"+Blood_type);
		System.out.println("Gender:"+Gender);
	}
	static void display() {
		System.out.println("Static Variables!!!");
		System.out.println(grp_cnt);
		System.out.println(age);
		System.out.println(code);
		System.out.println(phn);
		System.out.println(cgp);
		System.out.println(percent);
		System.out.println(blood_type);
		System.out.println(gender);
	}
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.Grp_cnt=15;
		d1.Age=22;
		d1.Code=4;
		d1.Phn=140256789;
		d1.Cgp=7.5f;
		d1.Percent=85.07;
		d1.Blood_type='O';
		d1.Gender=false;

		d1.Display();
		display();
	}

}
