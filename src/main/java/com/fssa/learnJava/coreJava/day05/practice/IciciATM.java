package com.fssa.learnJava.coreJava.day05.practice;

public class IciciATM implements ATM {

	public static final double CHARGE = 10.0d;

	public boolean deposit(Account account, double amount) {
		if (amount > 0) {
			account.setBalance(account.getBalance() + amount);
			return true;
		} else {
			throw new IllegalArgumentException("Amount cannot be Zero");
		}

	}

	public boolean withdraw(Account account, double amount) throws Exception {

		try {
			if (account.getBalance() < 10000) {
				throw new Exception("Unable to withdraw because your balance in less than Rs.10,000");

			} else {
				account.setBalance((account.getBalance() - amount) - CHARGE);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (false);
		}
		return (true);
	}

	public double getBalance(Account account) {
		return account.getBalance();
	}

}
