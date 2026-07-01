package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. Filter Strings Longer Than 5 Characters
public class Demo5 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "SpringBoot", "API", "Microservices");

		List<String> word = words.stream().filter(w -> w.length() > 5).collect(Collectors.toList());
		System.out.println(word);
	}

}
