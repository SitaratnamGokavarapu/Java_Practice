package com.StringHandling;

import java.util.Scanner;

public class LongestSubPalindrome {

	public static boolean isPalindrome(String sub) {
		String rstr = "";
		for (int i = 0; i < sub.length(); i++) {
			char ch = sub.charAt(i);
			rstr = ch + rstr;
		}
		return rstr.equals(sub);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String result = " ";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				String sub = str.substring(i,j+1);
				if (isPalindrome(sub)) {
					if(sub.length()>result.length()) {
					result = sub;
					}
				}
			}
		}
		System.out.println(result);
	}
}
	


