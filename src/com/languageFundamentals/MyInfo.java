package com.languageFundamentals;

//No return type + with arguments

public class MyInfo {
	
	void getName(String name) {
		System.out.println("My Name is : " + name);
	}
	void getFatherName(String name) {
		System.out.println("My Father Name is : " +name);
		
	}
	void getMotherName(String name) {
		 System.out.println("My Mother Name is : " + name);
	 }
	void getBrotherName(String name) {
		 System.out.println("My Brother Name is : " + name);
	 }
	

 void main(String[] args) {
		System.out.println("main method loaded");
	
		getName("Pravallika");
		getFatherName("Satyanarayana");
		getMotherName("Nancharamma");
		getBrotherName("Sagar");
		
		System.out.println("Main method ended");
		
	}

 
}
