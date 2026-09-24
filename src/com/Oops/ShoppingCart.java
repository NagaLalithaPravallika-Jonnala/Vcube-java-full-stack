package com.Oops;

public class ShoppingCart {
 private int cartItems;
 private double totalAmount;
 public void addItem(double price) {
	 if(price > 0) {
		 cartItems = cartItems + 1;
		 totalAmount = totalAmount + price;
	 }
	 else {
		 System.out.println("");
	 }
 }
 public void removeItem(double price) {
	 if(totalAmount>=price) {
		 cartItems--;
		 totalAmount = totalAmount-price;
	 }
	 
 }
 public double getTotal() {
	 return totalAmount;
 }
 public void setCartItem(int cartItem) {
	 this.cartItems = cartItem;
 }
 public int getCartItem() {
	 return cartItems;
 }
 public void setTotalAmount(double totalAmount) {
	 this.totalAmount = totalAmount;
 }
 public double getTotalAmount() {
	 return totalAmount;
 }
}
