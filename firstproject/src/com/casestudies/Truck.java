package com.casestudies;

public class Truck extends Vehicle {
	Truck(String name, int speed) {
		super(name, speed);
	}

	void LoadCargo() {
		System.out.println(name + " can load Cargo!!");
	}

}
