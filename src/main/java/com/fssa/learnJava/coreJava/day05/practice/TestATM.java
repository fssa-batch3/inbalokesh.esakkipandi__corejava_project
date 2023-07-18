package com.fssa.learnJava.coreJava.day05.practice;

public class TestATM {

	public static void main(String[] args) throws Exception {

//		Account p = new Account("in12", 1000);
//		
//		ATM a = new AxisATM();
//		boolean deposit = a.deposit(p, 5000);
//		boolean withdraw = a.withdraw(p, 1000);
//		double balance = a.getBalance(p);
//		System.out.println("Deposit status " + deposit);
//		System.out.println("Withdraw Status " + withdraw);
//		System.out.println("Balance = " + balance);
		
		Account c = new Account("in123", 6000);
		ATM b = new IciciATM();
		boolean deposit1 = b.deposit(c, 5000);
		boolean withdraw1 = b.withdraw(c, 1000);
		double balance1 = b.getBalance(c);
		System.out.println("Deposit status " + deposit1);
		System.out.println("Withdraw Status " + withdraw1);
		System.out.println("Balance = " + balance1);

	}

}
