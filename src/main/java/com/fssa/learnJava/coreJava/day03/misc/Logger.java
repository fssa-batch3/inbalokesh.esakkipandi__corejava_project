package com.fssa.learnJava.coreJava.day03.misc;

import java.time.LocalDateTime;

public class Logger {
	
	public static void info(String msg) {	
		System.out.println(msg);
	}
	
	public static void debug(String msg) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date.toString().concat("\n").concat(msg));
	}

	public static void main(String[] args) {
		
		Logger.info("I am inba");
		Logger.debug("I am Inba and Lokesh is my second name");
	}
}
