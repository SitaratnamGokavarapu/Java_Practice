package com.casestudies;

public class Bike extends Vehicle{

	Bike(String name, int speed) {
		super(name,speed);
	}
	
	void Wheelie() {
		System.out.println(name+" can do a wheelie!");
	}
	

}
