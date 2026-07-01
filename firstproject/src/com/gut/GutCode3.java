package com.gut;

public class GutCode3 {

	public static void main(String[] args) {
		int ranges[][] = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		
		int result[]=new int[ranges.length];
		for( int i=0;i<ranges.length;i++) {
			for(int j=0;j<ranges.length;j++) {
				if(i==j) continue;
				if(ranges[i][0]>=ranges[j][0]&& ranges[i][1]<=ranges[j][1]) {
					result[i]=-1;
					break;
				}
			}
		}
		for(int x:result) {
			System.out.println(x);
		}
	}

}
