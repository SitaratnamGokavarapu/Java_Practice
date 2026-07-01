package com.encapsulation;

public class User {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		if (password.length() >= 6) {
			System.out.println("Password:");
		} else {
			return "Weak password";
		}
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
