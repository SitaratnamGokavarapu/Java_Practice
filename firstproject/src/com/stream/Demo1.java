package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(10,15,25,35,20,30,40,50,60,70,80,90,99);
		
		List<Integer> list2=list1.stream().filter(i->i%3==0).collect(Collectors.toList());
		System.out.println(list2);
	}

}
