package com.Oops;

public class ShoppingDriverClass {

	public static void main(String[] args) {
		ShoppingCart s = new ShoppingCart();
		
		
		s.addItem(200);
		s.addItem(3000);
		s.removeItem(100);
		s.getTotal();
		System.out.println(s.getCartItem());
		
		System.out.println(s.getTotalAmount());

	}

}
