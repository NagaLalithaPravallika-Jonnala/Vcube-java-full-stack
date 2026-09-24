package com.Oops;

public class EncapsulatedBankAccount {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccountNumber(234560577);
		System.out.println(b.getAccountNumber());
		b.setHolderName("SBI");
		System.out.println(b.getHolderName());
		b.setBalance(5000);
		System.out.println(b.getBalance());
		b.deposite(500);
		System.out.println(b.getBalance());
		b.withdraw(1500);
		System.out.println("available balance:"+b.getBalance());
	}

}
