package com.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings:");
		String s1=sc.next();
		String s2=sc.next();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
