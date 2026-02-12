package com.javafundamentals.constuctors;

class Institute {
	String name = "ABC College";

	void show() {
		System.out.println("College Method");
	}
}

class Students extends Institute {
	String name = "XYZ Student";

	void show() {
		System.out.println("Student Method");
	}

	void display() {
		System.out.println(super.name); // parent variable
		super.show(); // parent method
		System.out.println(this.name); // current class variable
		this.show(); // current class method
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.display();
	}
}
