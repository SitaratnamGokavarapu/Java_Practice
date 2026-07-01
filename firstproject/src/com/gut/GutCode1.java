package com.gut;

import java.util.Arrays;

public class GutCode1 {

	public static void main(String[] args) {
		int[] arr= {2,1,4,8,1};
		int[] result=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			result[i]=-1;
			for(int j=0;j<arr.length;j++) {
				int nextIndex=(i+j)%arr.length;
				
				if(arr[nextIndex]>arr[i]) {
					result[i]=arr[nextIndex];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
