package com.javafundamentals;

public class ElectricityBill {
	int units = 90;
	double rate_of_unit = 12;
	static double bill;

	double gst_bill() {
		bill = units * rate_of_unit;
		double gstAmount = gst();
		System.out.println(gstAmount);
		double finalAmount = gstAmount + bill;
		System.out.println(finalAmount);
		return finalAmount;
	}

	static double gst() {
		double Gst = (3 / 100.0) * bill;
		return Gst;
	}

	public static void main(String[] args) {
		ElectricityBill e = new ElectricityBill();
		double finalelectricity = e.gst_bill();
		System.out.println(finalelectricity);
	}

}
