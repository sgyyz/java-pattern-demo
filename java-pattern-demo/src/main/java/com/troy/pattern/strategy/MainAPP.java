package com.troy.pattern.strategy;

public class MainAPP {
	public static void main(String[] args) {
		// Define a shopping cart
		ShoppingCart cart = new ShoppingCart();
		
		// add the item in the shopping cart
		cart.addItem(new Item("1234", 20));
		cart.addItem(new Item("7890", 10));
		
		// 1. using the credit card pay the items.
		cart.pay(new CreditCardPayment("BCC", "5855885669844", "694", "12/16"));
		
		// 2. using the Paypal to pay the items
		cart.pay(new PaypalPayment("example@example.com", "123456"));
	}
}
