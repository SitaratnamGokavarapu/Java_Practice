package com.arrays;

public class Stock_Sellings_Bought {

	public static void main(String[] args) {
		int[] arr= {19,30,2,15,4,6,18};
//					s, m, t, w, t,f,s
		int buyprice=0;
		int sellprice=0;
		int max_profit=0;
		for(int i=0;i<arr.length;i++) {
			int buy_day=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int sell_day=arr[j];
				int profit=sell_day-buy_day;
				if(profit>max_profit) {
					max_profit=profit;
					buyprice=arr[i];
					sellprice=arr[j];
				}
			}
		}
		System.out.println("Best Day to buy the price:"+buyprice);
		System.out.println("Best Day to sell the price:"+sellprice);
		System.out.println("The profit price:"+max_profit);

	}

}
