package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//3. Filter Names Starting With "A"
public class Demo4 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anu", "Ravi", "Arjun", "Kiran");

		List<String> nameWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(nameWithA);
	}

}
