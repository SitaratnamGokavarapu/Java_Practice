package com.javafundamentals.constuctors;

public class Vehicle {

	String regno;
	String ownName;

	public Vehicle() {

	}

	public Vehicle(String regno, String ownName) {
		this.regno = regno;
		this.ownName = ownName;
	}

	public Vehicle(Vehicle v) {
		v.regno = regno;
		v.ownName = ownName;
	}
	public static void main(String[] args) {
		Vehicle v2=new Vehicle("AP12TG1234", "Navya");
		v2.regno="02345";
		
	}

	public class Car extends Vehicle {
		String Model;
		int price;

//		Car(String Model, int price){
//			this.Model=Model;
//			this.price=price;
//		}
		Car(Vehicle v, String Model, int price) {
			super(v);
		}

		void display() {
			System.out.println("******");
			System.out.println("Car Regno: " + regno);
			System.out.println("Car Ownername: " + ownName);
			System.out.println("Car Model: " + Model);
			System.out.println("Car Price: " + price);
		}

		public static void main(String[] args) {
//			Vehicle v1 = new Vehicle("AP12TG1234", "Navya");
//
//			Car c = new Car(v1,"Ertiga", 1000000);
//			c.display();
		}
	}
}
