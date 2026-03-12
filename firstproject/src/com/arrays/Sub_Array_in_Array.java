package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sub_Array_in_Array {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of the array:");
		   int size=sc.nextInt();
		   int[] arr=new int[size];
		   System.out.println("Enter the elements into the array:");//6,2,8,7,3
		   for(int i=0;i<arr.length;i++) {
			   arr[i]=sc.nextInt();
		   }
		   //ascending order
//		   for(int i=0;i<arr.length;i++) {
//			   for(int j=i+1;j<arr.length;j++) {
//				   if(arr[j]<arr[i]) {
//					   int temp=arr[j];
//					   arr[j]=arr[i];
//					   arr[i]=temp;
//				   }
//			   }
//		   }
		   Arrays.sort(arr);
		   System.out.println(Arrays.toString(arr));
		   int maxlength=1;
		   int current_length=1;
		   int startIndex=0;
		   int maxStartIndex=0;
		   for(int i=1;i<arr.length;i++) {
			   if(arr[i]==arr[i-1]+1) {
				   current_length++;
			   }else {
				   if(current_length>maxlength) {
					   maxlength=current_length;
					   maxStartIndex=startIndex;
				   }
				   current_length=1;
				   startIndex=i;
			   }
		   }
		   if(current_length>maxlength) {
			   maxlength=current_length;
			   maxStartIndex=startIndex;
		   }
		   int[] subarr=new int[maxlength];
		   for(int i=0;i<maxlength;i++) {
			  subarr[i]=arr[maxStartIndex+i];
		   }
		   System.out.println("Largest Continuous Subarray:");
		   System.out.println(Arrays.toString(subarr));
		   
		   sc.close();
	}

}
