package com.fssa.learnJava.coreJava.day02.misc;

public class App {

	public static void main(String[] args) {
		
		Academy ac = new Academy();
		ac.setName("Freshworks Software Academy");
		ac.setId(1234);
		ac.setCode("Fssa");
		
		Student student = new Student();
		student.setName("Inba");
		student.setEmail("inba@gmail.com");
		student.setId(1);
		System.out.println(Student.academy);
		System.out.println(Student.count);
		
		Student student1 = new Student();
		student1.setName("Maruthan");
		student1.setEmail("maruthu@gmail.com");
		student1.setId(2);
		System.out.println(Student.academy);
		System.out.println(Student.count);
	}

}
