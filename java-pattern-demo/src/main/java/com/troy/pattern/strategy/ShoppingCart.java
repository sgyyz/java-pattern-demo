package com.troy.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	private int calculateTotal() {
		int sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	/**
	 * IMPORTANT: This method as the strategy operator. The strategy passes in
	 * this method as the parameter. As the user just pass the implementation
	 * class of the strategy interface.<br/>
	 * <br/>
	 * 
	 * So here is the common place to invoke the pay method, it dosen't care the
	 * which PaymentStrategy passed in, just invoke the method in the
	 * PaymentStrategy interface.
	 */
	public void pay(PaymentStrategy paymentStrategy) {
		int total = calculateTotal();
		paymentStrategy.pay(total);
	}
}
