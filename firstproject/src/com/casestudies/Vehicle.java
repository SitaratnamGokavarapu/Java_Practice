package com.casestudies;

public class Vehicle {
	String name;
	int speed;

	Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	void start() {
		System.out.println(name + " is starting");
	}

	void stop() {
		System.out.println(name + " is stopping");
	}
}
