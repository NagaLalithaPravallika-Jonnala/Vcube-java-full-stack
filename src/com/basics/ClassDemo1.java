package com.basics;

public class ClassDemo1 {
	public static void main(String[] args) {
		System.out.println("Main method started!");	
		ClassDemo1 c=new ClassDemo1();
		c.welcome();
		hello();
	}
	public static void hello() {
		System.out.println("Static method called");
	}
	void welcome() {
		System.out.println("Instance method called");
	}
}
