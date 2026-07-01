package com.encapsulation;

public class Main {

	public static void main(String[] args) {
		User u = new User();
		u.setUsername("Navya");
		u.setPassword("NAvya1");
		String username = u.getUsername();
		System.out.println("Username:" + username);
		String password = u.getPassword();
		System.out.print(password);
	}

}
