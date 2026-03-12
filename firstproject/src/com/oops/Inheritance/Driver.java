package com.oops.Inheritance;

public class Driver {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.getRate("%");
		HDFC h = new HDFC();
		h.getRate("%");
		ICICI i = new ICICI();
		i.getRate("%");
	}
}

class Bank {
	int rate = 5;

	int getRate() {
		return rate;
	}

	void main(String[] args) {

	}

}

class SBI extends Bank {
	int rate = 6;

	int getRate(String Symb) {
		System.out.println(rate + Symb);
		return rate;
	}
}

class HDFC extends Bank {
	int rate = 7;

	int getRate(String Symb) {
		System.out.println(rate + Symb);
		return rate;
	}
}

class ICICI extends Bank {
	int rate = 8;

	int getRate(String Symb) {
		System.out.println(rate + Symb);
		return rate;
	}
}