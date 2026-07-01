package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {
		Collection<Object> c=new ArrayList<>();
		c.add("Navya");
		c.add("Satya");
		c.add("Sri");
		c.add("Sita");
		c.add("Ratnam");
		for(Object c1:c) {
			System.out.println(c1);
		}
	}

}
