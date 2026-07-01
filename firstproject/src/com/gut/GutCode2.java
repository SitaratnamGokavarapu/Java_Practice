package com.gut;

public class GutCode2 {
	public static int sum(Object[] arr) {
	int total = 0;
   	for (Object obj : arr) {
		if(obj instanceof Integer) {
			total+=(Integer)obj;
			
		}
		else if(obj instanceof Object[]) {
			total+=sum((Object[])obj);
		}
	}
	return total;
	}
	public static void main(String[] args) {

		Object arr[] = { 10, new Object[] { 20, 30, new Object[] { 40, 50 } } };
		System.out.println(sum(arr));
	}

}
