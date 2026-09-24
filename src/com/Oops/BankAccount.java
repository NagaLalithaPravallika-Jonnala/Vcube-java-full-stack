package com.Oops;

public class BankAccount {
  private int accountNumber;
  private String holderName;
  private double balance;
 
  
  public void setAccountNumber(int accountNumber) {
	  this.accountNumber = accountNumber;  
  }
  public int getAccountNumber() {
	  return accountNumber;
  }
  public void setHolderName(String holderName) {
	  this.holderName = holderName;
  }
  public String getHolderName() {
	  return holderName;
  }
  public void setBalance(double balance) {
	  this.balance = balance;
  }
  public double getBalance() {
	  return balance;
  }
  
  
  
  public void deposite(double deposit) {
	  balance = balance + deposit;
	  
  }
  
  
  public void withdraw(int withdrawamount) {
	  balance= balance - withdrawamount;

	  
  }
} 
