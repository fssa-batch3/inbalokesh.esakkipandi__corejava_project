package com.fssa.learnJava.coreJava.day03.practice;

public class User {

	private int id;
	private String name;
	private String password;
	private String email;

	public User() {
		
	}
	
	public User(String newName, String newPassword, String newEmail) {
		this.name = newName;
		this.password = newPassword;
		this.email = newEmail;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
