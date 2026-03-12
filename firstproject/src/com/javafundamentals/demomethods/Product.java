package com.javafundamentals.demomethods;

import java.util.Scanner;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int stockQuantity;

	void UpdateStock(int Quantity) {
//		stockQuantity += Quantity;
		System.out.println("Updated Stock:"+stockQuantity);
	}

	void SellProduct(int Quantity) {
		if (Quantity < stockQuantity) {
			stockQuantity -= Quantity;
			UpdateStock(stockQuantity);
			
		} else {
			System.out.println("Stock Quantity is not that much available..!");
		}
	}

	void getProductDetails() {
		System.out.println("ProductId: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println("Product Quantity: " + stockQuantity);
	}

	public static void main(String[] args) {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);

		p.setProductId(101);
		p.setProductName("IBM");
		p.setPrice(20);
		p.setStockQuantity(50);
		
		p.getProductDetails();
		System.out.println("Enter the Quantity to sell:");
		int Quantity = sc.nextInt();
		p.SellProduct(Quantity);
		p.getProductDetails();
		sc.close();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		if (stockQuantity > 0) {
			this.stockQuantity = stockQuantity;
		}
	}

}
