package com.javafundamentals.constuctors;

import java.util.*;

public class Movies_1 {

	String Moviename;
	String Hero;
	String Heroine;
	int Dow;
	double budget;
	String Director;

	static Scanner sc = new Scanner(System.in);

	// No-argument constructor
	public Movies_1() {
		this(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble(), sc.nextLine());
		System.out.println("No argument Constructor");

	}

	// No-argument Constructor
	public Movies_1(String MovieName) {
		System.out.println("One argument Constructor");
	}

	public Movies_1(String Moviename, String Hero) {
		//this(sc.nextLine(), sc.nextLine());
		System.out.println("Two argument Constructor-1");
	}

	public Movies_1(String Moviename,int Dow) {
		//this(Moviename,Hero);
		System.out.println("Two argument Constructor-2");
	}
	public Movies_1(String Moviename, String Hero, String Heroine) {
		this(Moviename,Hero);
		System.out.println("Three argument Constructor");
	}

	public Movies_1(String Moviename, String Hero, String Heroine, int Dow) {
		this(Moviename,Hero,Heroine);
		System.out.println("Four argument Constructor");
	}

	public Movies_1(String Moviename, String Hero, String Heroine, int Dow, double budget) {
		this(Moviename,Hero,Heroine,Dow);
		System.out.println("Five argument Constructor");
	}
	public Movies_1(String Moviename, String Hero, String Heroine, int Dow, double budget, String Director) {
		this(Moviename,Hero,Heroine,Dow,budget);
		System.out.println("Six argument Constructor");
	}

	public static void main(String[] args) {
		Movies_1 m = new Movies_1();
		m.Show();
	}
	
	void Show() {
		System.out.println("------------------Cast&Crew---------------------");
		System.out.println("Moviename: " + Moviename);
		System.out.println("Hero: " + Hero);
		System.out.println("Heroine: " + Heroine);
		System.out.println("Days of Shooting: "+Dow);
		System.out.println("Movie Budget: " + budget);
		System.out.println("Movie Director " + Director);
	}

}
