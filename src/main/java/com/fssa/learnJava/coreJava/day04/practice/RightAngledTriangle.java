package com.fssa.learnJava.coreJava.day04.practice;

public class RightAngledTriangle extends Rectangle {
	protected double c;

	public RightAngledTriangle(double a, double b, double c) throws Exception {
		super(3, c);
		this.c = c;
	}

	@Override
	public double calculateArea() {
		return (this.c * this.c) / 2.0;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = super.calculatePerimeter();
		return perimeter + this.c;
	}

}