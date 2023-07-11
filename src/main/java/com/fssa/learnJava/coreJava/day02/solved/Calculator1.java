package com.fssa.learnJava.coreJava.day02.solved;

public class Calculator1 {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public String add(String a, String b) {
		return a + " " + b;
	}

	public static void main(String[] args) {
		// Usage
		Calculator1 calc = new Calculator1();
		System.out.println(calc.add(2, 3)); // Output: 5
		System.out.println(calc.add(2.5, 3.7)); // Output: 6.2
		System.out.println(calc.add("Hello", "World")); // Output: HelloWorld

	}
}