package com.nqt;

import java.util.Scanner;

//public class ListEvenSum {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//
//		while (t != 0) {
//			int n = sc.nextInt();
//			int arr[] = new int[n];
//			for (int i = 0; i < n; i++) {
//				arr[i] = sc.nextInt();
//			}
//			int count=0;
//			for(int i=0;i<n;i++) {
//				for(int j=i+1;j<n;j++) {
//					if((arr[i]+arr[j])%2==0) {
//						count++;
//					}
//				}
//			}
//			System.out.println(count);
//			t--;
//		}
//
//	}
//
//}

public class ListEvenSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }

            long evenPairs = (long) evenCount * (evenCount - 1) / 2;
            long oddPairs = (long) oddCount * (oddCount - 1) / 2;

            System.out.println(evenPairs + oddPairs);
        }
    }
}
