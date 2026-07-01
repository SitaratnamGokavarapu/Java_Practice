package com.abstraction;

import java.util.Scanner;

abstract class Shape {
	Scanner sc = new Scanner(System.in);

	abstract double CalculateArea();

	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println("Area of circle is:"+c.CalculateArea());
		Rectangle r1 = new Rectangle();
		System.out.println("Area of circle is:"+r1.CalculateArea());
	}

}

class Circle extends Shape {
	double CalculateArea() {
		double r = sc.nextDouble();
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	double CalculateArea() {
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		return l * b;
	}
}
