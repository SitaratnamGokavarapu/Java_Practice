package com.patterns.star;

public class ExamQ_Pattern {

	public static void main(String[] args) {
		int n=6;
		int num=1;
		int alt=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			int count=n-i+1;
			for(int k=1;k<=count;k++) {
				if(num<=9) {
					System.out.print(num+" ");
					num++;
				}
				else {
					if(alt%2==0) {
						System.out.print("0"+" ");
					}else {
						System.out.print("9"+" ");
					}
					alt++;
				}
			}
			System.out.println();
		}
	}

}
