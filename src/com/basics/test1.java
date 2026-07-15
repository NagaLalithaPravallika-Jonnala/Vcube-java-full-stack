package com.basics;

public class test1 {

	static {
		System.out.println("Static block loaded");
		test1 t=new test1();
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		
	}
	
	{
		System.out.println("Instance block loaded");
	}
}
