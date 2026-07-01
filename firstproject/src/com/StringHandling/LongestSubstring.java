package com.StringHandling;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result="";
		for(int i=0;i<str.length();i++) {
			String temp="";
			
			for(int j=i;j<str.length();j++) {
				char ch=str.charAt(j);
				
				if(temp.indexOf(ch)!=-1) {
					break;
				}
				temp+=ch;
				if(temp.length()>result.length()) {
					result=temp;
				}
			}
		}
		System.out.println(result); 
	}

}
