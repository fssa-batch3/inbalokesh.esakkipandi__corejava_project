package com.fssa.learnJava.coreJava.day01.solved;

public class MyClass {

//    // Declare a static variable
//    public static int staticVariable;
//
//    public static void main(String[] args) {
//        // Access the static variable using the class name
//        MyClass.staticVariable = 10;
//        System.out.println(MyClass.staticVariable);
//    }

	
// Declare an instance variable
	public int instanceVariable;

	public static void main(String[] args) {
		// Create an object of MyClass
		MyClass myObject = new MyClass();

		// Access the instance variable using the object reference
		myObject.instanceVariable = 5;
		System.out.println(myObject.instanceVariable);
	}

}
