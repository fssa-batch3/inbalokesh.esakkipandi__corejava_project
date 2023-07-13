package com.fssa.learnJava.coreJava.day04.solved;

public class ToStringDemo {

	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		Account3 acct1 = new Account3();
		acct1.setAccNo("A001");
		acct1.setName("Inba");
		acct1.setBalance(8888);

		System.out.println(acct1.toString());
	}

}
