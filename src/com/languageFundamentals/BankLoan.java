package com.languageFundamentals;
//with return type+ with arguments
import java.util.Scanner;

public class BankLoan {
	double calculateInterest(double principle,double rate,double time) {
		double inter=((principle*rate*time)/100);
		System.out.println("simple interest : " + inter);
		return inter;
	}

	 void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter principle Amount : " );
	 
	 double principle = sc.nextDouble();
	 System.out.println("Enter Rate of intrest : ");
	 double rate = sc.nextDouble();
	 System.out.println("Enter Time : ");
	 double time = sc.nextDouble();
	 double inter=calculateInterest(principle,rate,time);

	}

}
