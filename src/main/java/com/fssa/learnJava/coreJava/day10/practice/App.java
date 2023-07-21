package com.fssa.learnJava.coreJava.day10.practice;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an email address: ");
			String email = sc.nextLine();

			try {
				boolean isValid = EmailValidator.isValidEmail(email);
				System.out.println("Email is valid: " + isValid);
			} catch (InvalidEmailException e) {
				System.out.println("Invalid email: " + e.getMessage());
			}
		
	}

}
