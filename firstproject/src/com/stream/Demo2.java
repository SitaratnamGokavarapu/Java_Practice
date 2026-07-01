package com.stream;

//Filter Even Numbers
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(11,22,33,44,55,66);
		
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
	}

}
