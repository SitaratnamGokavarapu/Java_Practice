package com.arrays;

import java.util.Scanner;

public class Chicken_legs {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int heads=sc.nextInt();
		   int legs=sc.nextInt();
		   int chicken=0;
		   int rabbit=0;
		   while(heads%2==0 && legs%6==0 ) {
			   chicken=chicken+1;
			   rabbit=rabbit+1;
			   heads=heads-2;
			   legs=legs-6;
		   }

		   System.out.println(chicken);
		   System.out.println(rabbit);

		   sc.close();
		
		
		
	}

}
