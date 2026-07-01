package com.casestudies;

public class Exam_Apr_03_01 {

	public static void main(String[] args) {
		String s="java full stack";
		String t=s.trim();
		String[] arr=t.split("\\s+");
		System.out.println(arr.length);
		System.out.println(arr[0]+"-"+arr[arr.length-1]);
	}

}
