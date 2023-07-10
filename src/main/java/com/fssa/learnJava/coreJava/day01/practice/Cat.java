package com.fssa.learnJava.coreJava.day01.practice;

public class Cat {
	
	// Attributes
    private String color;
    private byte age;

    // Getters and setters
    public byte getAge() {
        return age;
    }

    public void setAge(byte newAge) {
        this.age = newAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak() {
		System.out.println(" Meow!");
	}
    
    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat();
        cat1.setColor("Purple");
        cat1.setAge((byte)8);
        Cat cat2 = new Cat();
        cat2.setColor("Blue");
        cat2.setAge((byte)4);

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.print("Speaks:");
        cat1.speak();
        System.out.println("Dog 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.print("Speaks:");
        cat2.speak();
    }

}
