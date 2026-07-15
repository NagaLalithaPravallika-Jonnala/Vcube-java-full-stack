package com.basics;

public class Rectangle {
	void calculateArea() {
	int length=50;
	int breadth=5;
	int area=length*breadth;
	System.out.println("Area of the Rectangle : " + area);
	}
	void calculatePerimeter() 
	{
		int length=50;
		int breadth=5;
		int perimeter=2*(length*breadth);
		System.out.println("Perimeter of the Rectangle : " + perimeter);
	}
	public static void main(String[] args) {
	  Rectangle  c1=new  Rectangle();
	  c1. calculateArea();
	  Rectangle  c2=new  Rectangle();
	  c2.calculatePerimeter();
		
	}

}
