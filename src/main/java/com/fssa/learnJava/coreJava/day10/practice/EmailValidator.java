package com.fssa.learnJava.coreJava.day10.practice;

public class EmailValidator {

	public static boolean isValidEmail(String emailId) throws InvalidEmailException {

		if ("".equals(emailId)) {
			return false;
		} else if (emailId.contains("@") && emailId.contains(".")) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email address!");
		}
	}
}
