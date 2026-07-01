package com.casestudies;

public class TestPayment extends Payment {

	public static void main(String[] args) {
		Creditcard c = new Creditcard();
		c.Payment();
		Debit d = new Debit();
		d.Payment();
		UPI u = new UPI();
		u.Payment();
	}

}
