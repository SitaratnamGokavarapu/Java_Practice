package com.casestudies;

import java.util.Scanner;

public class Online_Shopping_Platform {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for storing the list items:");
		int size=sc.nextInt();
		double[] product_price=new double[size];
		System.out.println("Enter the product prices: ");
		for(int i=0;i<size;i++) {
			product_price[i]=sc.nextDouble();
		}
		double min=product_price[0];
		double max=product_price[0];
		for(int i=0;i<size;i++) {
			if(product_price[i]>max) {
				max=product_price[i];
			}
			else if(product_price[i]<min){
				min=product_price[i];
			}
		}
		System.out.println("Maximum price in the List:"+max);
		System.out.println("Minimum price in the List:"+min);

		double average=0;
		double total_prices=0;
		for(int j=0;j<size;j++) {
			total_prices=total_prices+product_price[j];
		}
		average=total_prices/size;
		System.out.println("The average price of all prices is:"+average);
		System.out.println("The products price that are greater than the average prices are :");
		for(int k=0;k<size;k++) {
			if(average<product_price[k]) {
				System.out.println(product_price[k]);
			}
		}
	}

}
