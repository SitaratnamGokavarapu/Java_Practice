package com.arrays;

import java.util.Scanner;

public class Min_Max_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		String[] names=new String[size];
		System.out.println("Enter elements:");// navya,mani,siri,Geeshma,lassi
		for (int i = 0; i < size; i++) {
			names[i] = sc.next();
		}
		String min=names[0];
		String max=names[0];
		
		for(int i=0;i<size;i++) {
			if(names[i].length()>max.length()) {
				max=names[i];
			}
			else if(names[i].length()<min.length()) {
				min=names[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		sc.close();
	}

}
