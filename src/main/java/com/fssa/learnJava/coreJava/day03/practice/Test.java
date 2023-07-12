package com.fssa.learnJava.coreJava.day03.practice;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");

        System.out.println("id=" + e1.getId() +", " + "name=" +  e1.getName());	
        System.out.println("id=" + e2.getId() +", " + "name=" +  e2.getName());	
        
        
        User user1 = new User("Inba", "inb123", "inba@gmail.com");
        System.out.println("Name= " + user1.getName() + ", Password= " + user1.getPassword() + ", Email= " + user1.getEmail());
    }

}
