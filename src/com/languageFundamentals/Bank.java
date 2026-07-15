package com.languageFundamentals;

public class Bank {
	double balance=100;
	void checkBalance() {
		System.out.println("The current balance : " +balance);
	}
	void deposite(int amt) {
		balance+=amt;
		System.out.println("The Deposite Amount : " +balance);
		
		checkBalance();	}
	void withdraw(int amt) {
		 // balance-=amt;
		System.out.println("Withdraw amount : " + amt);
		  balance-=amt;
		  checkBalance();

	}
	
   void main(String[] args) {
	 System.out.println("Main method started");	
     checkBalance();
     deposite(50);
     withdraw(170);
     System.out.println("Main method ended");	
   	}

}
