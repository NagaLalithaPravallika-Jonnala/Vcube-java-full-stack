package com.ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
	System.out.println("Main method started");
	String s = null;
	String s1 = "null";
	String s2 = "";
	System.out.println(s1.length());
	System.out.println(s2.length());
	try {
		System.out.println("in try");
	    System.out.println(s.length());
	    }catch(NullPointerException ne) {
	    	System.out.println("in catch");
        	ne.printStackTrace();
//	    	System.out.println(ne.getMessage());
	    }
	System.out.println("Main method ended");
	
	}
}
