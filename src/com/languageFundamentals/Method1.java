package com.languageFundamentals;

public class Method1 {
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
	    hello();
	    Method1 m1=new Method1();
	    m1.show();
	    hii();
	    m1.hlo();
		System.out.println("Main Method Ended");
	}
	static void hello() {
		System.out.println("Static Block Loaded");
		System.out.println("Hello,Good Morning");
		System.out.println("Welcome to Java World");
		
	}
	void show() {
		System.out.println("Instance Block Loaded");
		System.out.println("Hello,Good Evening");
	}
	private static void hii() {
		System.out.println("Static Block1 Loaded");
	}
	private void hlo() {
		System.out.println("Instance Block1 Loaded");
	}
}
