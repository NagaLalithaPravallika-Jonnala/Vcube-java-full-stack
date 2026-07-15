package com.languageFundamentals;

public class BankAccount {
	void displayAccount() {
		int accountNumber=123;
		String accountHolderName="Pravallika";
		String accountType="SBI";
		int balance=20000;
		System.out.println("AccountNumber : " + accountNumber );
		System.out.println("Account Holder Name :" + accountHolderName);
		System.out.println("Account Type : " + accountType);
		System.out.println("Balance : " + balance);
	}

	public static void main(String[] args) {
		
		BankAccount b1= new BankAccount();
		b1.displayAccount();
		

	}

}
