package com.javafundamentals.constuctors;

public class Book {
	String bookName;
	float price;

	Book() {

	}

	Book(String bookName, float price) {
//		System.out.println("Parameterized");
		this.bookName = bookName;
		this.price = price;
		}

//	public static void main(String[] args) {
//		System.out.println("Parent main method");
//	}

}

class Author extends Book {

	String authorname;
	String authorstate;

	Author(String bookName, float price, String authorname, String authorstate) {
//		System.out.println("child parameterized ");
		super(bookName, price);
//		this.bookName=bookName;
//		this.price=price;
		this.authorname = authorname;
		this.authorstate = authorstate;

	}

	void display() {
		System.out.println("BookName: " + bookName);
		System.out.println("Book Price: " + price);
		System.out.println("Book Author: " + authorname);
		System.out.println("Book Author's state: " + authorstate);
	}

	public static void main(String[] args) {
		Author a = new Author("NUVVU", 349f, "Satish", "Andhrapradesh");
		a.display();

//		Book b=new Book("Nuvvu",350f);
//		b.display();
			
	}
}
