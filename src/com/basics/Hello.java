package com.basics;

public class Hello {
	void main(String[] args) throws ClassNotFoundException {
		 System.out.println("hello");
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("hello");

		}
}
