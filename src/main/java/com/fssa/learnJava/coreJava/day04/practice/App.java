package com.fssa.learnJava.coreJava.day04.practice;

public class App {

	public static void main(String[] args) throws Exception {

		RightAngledTriangle obj = new RightAngledTriangle(4.0, 6.0, 2.0);
		System.out.println(obj.calculateArea());
		System.out.println(obj.calculatePerimeter());

		Rectangle obj1 = new Rectangle(4.0, 6.0);
		System.out.println(obj1.calculateArea());
		System.out.println(obj1.calculatePerimeter());

	}
}
