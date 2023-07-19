package com.fssa.learnJava.coreJava.day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ListOfEmployees {

		public static void main(String[] args) {
			
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the comma-separated department name and employee name pairs:");
	        System.out.println("Example input format: HR,Ram");

	        HashMap<String, List<String>> departmentEmployees = new HashMap<>();

	        while (true) {
	            System.out.print("Enter the input (or 'quit' to exit): ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("quit")) {
	                break;
	            }

	            String[] parts = input.split(",");

	            if (parts.length != 2) {
	                System.out.println("Invalid input format. Please try again.");
	                continue;
	            }

	            String department = parts[0].trim();
	            String employee = parts[1].trim();

	            List<String> employees = departmentEmployees.getOrDefault(department, new ArrayList<>());
	            employees.add(employee);
	            departmentEmployees.put(department, employees);
	        }

	        for (String department : departmentEmployees.keySet()) {
	            List<String> employees = departmentEmployees.get(department);
	            String employeeList = String.join(", ", employees);
	            System.out.println(department + ": " + employeeList);
	        }
	    

	}

}
