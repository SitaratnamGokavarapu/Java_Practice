package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Filter Odd Numbers Greater Than 50

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(23, 51, 62, 75, 81, 40);

		List<Integer> al = li.stream().filter(i -> i % 2 != 0 && i > 50).collect(Collectors.toList());
		System.out.println(al);
	}

}
