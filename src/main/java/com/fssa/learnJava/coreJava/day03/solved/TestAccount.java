package com.fssa.learnJava.coreJava.day03.solved;

public class TestAccount {
	
	   public static void main(String[] args) {
	         
	        //create Account
	        Account acct1 = new Account("A101", "Naresh" , 1000 );
	        System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);
	         
	         
	        //create Account
	        Account acct2 = new Account("A102","Arun", 1000);
	        System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
	        
			Account2 acct3 = new Account2();
			acct3.setAccNo("A101");
			acct3.setName("Naresh");
			acct3.setBalance(1000);

			System.out.println(acct3.getAccNo() + "-" + acct3.getName() + "-"
					+ acct3.getBalance());
			
			// Create Account with Overloaded constructor accepting parameters
			Account2 acct4 = new Account2("A102", "Arun", 1000);
			System.out.println(acct4.getAccNo() + "-" + acct4.getName() + "-"
					+ acct4.getBalance());

		}
	    
	 

}
