package com.casestudies;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Category:");
		String Category = sc.next();
		String yn = "";
		double totalBill = 0;
		do {
			switch (Category) {
			case "starters" -> {
				System.out.println("Enter Veg or Non-veg");
				String vg = sc.next();

				switch (vg) {
				case "Veg" -> {
					System.out.println("Select Veg Starter:");

					String vstarter = sc.next();
					switch (vstarter) {

					case "Panner" -> {

						System.out.println("Enter the Quantity: ");
						double quantity = sc.nextDouble();
						double price = 120.0;
						totalBill += quantity * price;
						System.out.println("The price is " + quantity * price);
					}
					case "Mushroom" -> {
						System.out.println("Enter the Quantity: ");
						double quantity = sc.nextDouble();
						double price = 150.0;
						totalBill += quantity * price;
						System.out.println("The price is " + quantity * price);
					}
					}
				}
				case "Non-veg" -> {
					System.out.println("Enter Nonveg Starter:");
					String nv = sc.next();
					switch (nv) {
					case "Chicken" -> {
						System.out.println("Enter the Quantity: ");
						double quantity = sc.nextDouble();
						double price = 100.0;
						totalBill += quantity * price;
						System.out.println("The price is " + quantity * price);
					}
					case "Mutton" -> {
						System.out.println("Enter the Quantity: ");
						double quantity = sc.nextDouble();
						double price = 140.0;
						totalBill += quantity * price;
						System.out.println("The price is " + quantity * price);
					}
					}
				}
				}
			}
			
				case "Main-course" -> {
					System.out.println("Enter Veg or Non-veg");
					String vg1 = sc.next();

					switch (vg1) {
					case "Veg" -> {
						System.out.println("Select Veg course:");

						String vmain = sc.next();
						switch (vmain) {

						case "Panner" -> {

							System.out.println("Enter the Quantity: ");
							double quantity = sc.nextDouble();
							double price = 120.0;
							totalBill += quantity * price;
							System.out.println("The price is " + quantity * price);
						}
						case "Mushroom" -> {
							System.out.println("Enter the Quantity: ");
							double quantity = sc.nextDouble();
							double price = 150.0;
							totalBill += quantity * price;
							System.out.println("The price is " + quantity * price);
						}
						}
					}
					case "Non-veg" -> {
						System.out.println("Enter Nonveg Course:");
						String nvmain= sc.next();
						switch (nvmain) {
						case "Chicken" -> {
							System.out.println("Enter the Quantity: ");
							double quantity = sc.nextDouble();
							double price = 100.0;
							totalBill += quantity * price;
							System.out.println("The price is " + quantity * price);
						}
						case "Mutton" -> {
							System.out.println("Enter the Quantity: ");
							double quantity = sc.nextDouble();
							double price = 140.0;
							totalBill += quantity * price;
							System.out.println("The price is " + quantity * price);
						}
						}
					}
					}
				}
				
			

			default -> System.out.println("The given item is currently unavailable!!");
			}

			System.out.println("Do u still want to continue..? click y for yes or n for no!!");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Thanks for ordering..!! Your total bill is : " + totalBill);
		sc.close();
	}
}
