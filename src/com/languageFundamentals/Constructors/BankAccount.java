package com.languageFundamentals.Constructors;

public class BankAccount {
	String accountHolder;
	int accountNumber;
	double balance;
	BankAccount(){
		this("Unknown");
		
	}
	
	BankAccount(String accountHolder){
		this( accountHolder,0);
		
	}
	
	BankAccount(String accountHolder,int accountNumber){
		this(accountHolder,accountNumber,0);
		
	}
	
	BankAccount(String accountHolder,int accountNumber,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		show();
	}
	
	
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		System.out.println("  ");
	    BankAccount b1 = new BankAccount("Krishna",0,0.0);
	    System.out.println("  ");
	    BankAccount b2 = new BankAccount("Krishna",1234567890,0.0);
	    System.out.println("  ");
	    BankAccount b3 = new BankAccount("Krishna",1234567890,50000.0);

	}
	void show() {
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
}
