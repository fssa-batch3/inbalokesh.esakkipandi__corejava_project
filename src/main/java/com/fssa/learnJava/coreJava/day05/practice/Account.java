package com.fssa.learnJava.coreJava.day05.practice;

class Account {
	String accNo;
	double balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String account, double bal) {
		this.accNo = account;
		this.balance = bal;
	}
}