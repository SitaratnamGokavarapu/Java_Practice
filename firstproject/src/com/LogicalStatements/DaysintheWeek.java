package com.LogicalStatements;

import java.util.Scanner;

public class DaysintheWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int day = sc.nextInt();
		// with arrow function
//		switch(day) {
//		case 1->{
//			System.out.println("Hey It's Monday..");
//			System.out.println("You have to work.");
//		}
//		case 2->System.out.println("Hey It's Tuesday.");
//		case 3->System.out.println("Hey It's Wednesday.There is a Market.");
//		case 4->System.out.println("Hey It's Thursday.You have a Deadline.");
//		case 5->System.out.println("Hey It's Friday.You can have fun.");
//		case 6->System.out.println("Hey It's Saturday.You have an exam then chill.");
//		case 7->System.out.println("Hey It's Sunday.Get ready for new start.");
//		default->System.out.println("Invalid day number");
//		}

		// with colon
		switch (day) {
		case 1: {
			System.out.println("Hey It's Monday..");
			System.out.println("You have to work.");
			break;
		}
		case 2: {
			System.out.println("Hey It's Tuesday.");
			break;
		}
		case 3: {
			System.out.println("Hey It's Wednesday.There is a Market.");
			break;
		}
		case 4: {
			System.out.println("Hey It's Thursday.You have a Deadline.");
			break;
		}
		case 5: 
			System.out.println("Hey It's Friday.You can have fun.");
			break;
		
		case 6: {
			System.out.println("Hey It's Saturday.You have an exam then chill.");
			break;
		}
		case 7: {
			System.out.println("Hey It's Sunday.Get ready for new start.");
			break;
		}
		default: {
			System.out.println("Invalid day number");
		}
		}
		sc.close();
	}

}
