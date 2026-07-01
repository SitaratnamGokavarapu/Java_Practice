package com.casestudies;

public class Exam_Apr_03_02 {

	public static void main(String[] args) {
		String s="RhYthm ApPlE";
		String vowels="aeiou";
		int pos=-1;
		
		for(int i=0;i<s.length();i++) {
			char ch=Character.toLowerCase(s.charAt(i));
			if(vowels.indexOf(ch)!=-1) {
				pos=i;
				break;
			}
		}
		System.out.println(pos);
	}

}
