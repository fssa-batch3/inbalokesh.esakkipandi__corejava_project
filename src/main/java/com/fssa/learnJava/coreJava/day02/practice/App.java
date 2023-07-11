package com.fssa.learnJava.coreJava.day02.practice;

public class App {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setName("Inba");
		user.setEmail("inba@gmail.com");
		user.setId(8);
		user.setPassword("in113");

		Logger.debug("HI");
		Logger.debug(2);
		Logger.info("H and I is present");
		Logger.info(3);
		Logger.error("I is also capital");
		Logger.error(505);
		
	}

}
