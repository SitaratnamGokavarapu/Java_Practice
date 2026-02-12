package com.javafundamentals.constuctors;

public class Movies {

	String MovieName;
	String Hero;
	String Heroine;
	double budget;

	// No-arg Constructor
	public Movies() {
		this("RajaSaab");
		System.out.println("No-arg Constructor!!");
	}

	// 1-arg Constructor
	public Movies(String MovieName) {
		this("Darling","Prabhas");
		System.out.println("One -arg Constructor!");
	}

	// 2-arg constructor
	public Movies(String MovieName, String hero) {
		this("Darling", "Prabhas", "Anushka");
		System.out.println("Two arg Constructor!!");
	}

	// 3-arg constructor
	public Movies(String MovieName, String Hero, String Herione) {
		this("Mr.Perfect", "Prabhas", "Anushka", 1000000000);
		System.out.println("Three arg Constructor!!");
		this.MovieName=MovieName;
	}

	// 4-arg constructor
	public Movies(String MovieName, String Hero, String Heroine, double budget) {
		System.out.println("Four arg Constructor");
		this.MovieName = MovieName;
		this.Hero = Hero;
		this.Heroine = Heroine;
		this.budget = budget;
	}

	// Details
	void display() {
		System.out.println("********Cast of Movie********");
		System.out.println("Moviename: " + MovieName);
		System.out.println("Hero: " + Hero);
		System.out.println("Heroine: " + Heroine);
		System.out.println("Movie Budget: " + budget);
	}

	public static void main(String[] args) {
		Movies m = new Movies();
		m.display();
	}

}
