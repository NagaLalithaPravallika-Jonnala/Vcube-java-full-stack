package com.languageFundamentals.Constructors;

public class Product {
	String productName;
	int productPrice;
	int productquantity;
	int totalCost;
	Product(){
		this("Laptop");
	}
	Product(String productName){
		this(productName,55000);
		
	}
	Product(String productName,int productPrice){
		this(productName,productPrice,2);
	}
	Product(String productName,int productPrice,int productquantity){
		this.productName=productName;
		this.productPrice=productPrice;
		this.productquantity=productquantity;
		System.out.println("Total Cost : " + (totalCost = productquantity * productPrice));
		
	}
	

	public static void main(String[] args) {
		Product p=new Product();
		System.out.println("Enter the Product Name : " + p.productName);
		System.out.println("Enter the Product Price : " + p.productPrice);
		System.out.println("Enter the Product Quantity : " + p.productquantity);
		
	}
	

}
