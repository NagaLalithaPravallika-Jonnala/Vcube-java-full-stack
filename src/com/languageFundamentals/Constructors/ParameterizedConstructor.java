package com.languageFundamentals.Constructors;
import java.util.Scanner;
public class ParameterizedConstructor {
	int productId;
	String productName;
	int productPrice;
	
	ParameterizedConstructor(int productId,String productName,int productPrice){
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		System.out.println("Product Id : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Product Price : " + productPrice);
	}
			
			
	public static void main(String[] args) {
		
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Product Id : ");
        int productId = sc.nextInt();
        System.out.println("Enter the Product Name : ");
        String productName = sc.next();
        System.out.println("Enter the Product Price : ");
        int productPrice = sc.nextInt();
        ParameterizedConstructor p = new ParameterizedConstructor(productId,productName,productPrice );
	}

}
