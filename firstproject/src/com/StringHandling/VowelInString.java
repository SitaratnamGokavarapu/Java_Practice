package com.StringHandling;

import java.util.Scanner;

public class VowelInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] s=s1.split("\\s");
		
		
		for(int i=0;i<s.length;i++) {
			char first=Character.toLowerCase(s[i].charAt(0));
			if(first=='a'|| first=='e'||first=='i'||first=='o'||first=='u') {
				System.out.println(s[i]);
			}
		}
		
	}

}
