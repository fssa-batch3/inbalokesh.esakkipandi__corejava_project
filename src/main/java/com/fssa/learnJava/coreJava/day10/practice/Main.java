package com.fssa.learnJava.coreJava.day10.practice;

import java.util.ArrayList;

class User {
	int id;
	String name;
	String emailId;

	public User(int id, String name, String emailId) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}

}

class UserRegistration {
	ArrayList<User> userList = new ArrayList<>();;

	public void register(User user) throws UserAlreadyExistException {
		for (User existingUser : userList) {
			if (existingUser.emailId.equals(user.emailId)) {
				throw new UserAlreadyExistException("User with email ID already exists: " + user.emailId);
			}
		}
		userList.add(user);
		System.out.println("User registered successfully!");
	}

}

public class Main {

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();

		try {
			registration.register(new User(1, "John Doe", "john@example.com"));
			registration.register(new User(2, "Jane Smith", "jane@example.com"));
			registration.register(new User(3, "Mike Johnson", "john@example.com")); // This should throw
																					// UserAlreadyExistsException
		} catch (UserAlreadyExistException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}