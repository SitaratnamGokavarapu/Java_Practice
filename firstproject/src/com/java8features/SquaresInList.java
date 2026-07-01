package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquaresInList {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Function<List<Integer>,Integer> f = (i)->{
		int sum=0;
		for(Integer l:i) {
			sum =sum+(l*l);
		}
		return sum;
	};
	System.out.println(f.apply(li));
}

}
