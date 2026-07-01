package com.casestudies;

public class VehicleTest {

	public static void main(String[] args) {
		Bike b = new Bike("Pulsar", 60);
		b.start();
		b.stop();
		b.Wheelie();
		Car c=new Car("Suzuki",100);
		c.start();
		c.stop();
		c.Sunroof();
		Truck t=new Truck("Ashok Leyland",80);
		t.start();
		t.stop();
		t.LoadCargo();
	}

}
