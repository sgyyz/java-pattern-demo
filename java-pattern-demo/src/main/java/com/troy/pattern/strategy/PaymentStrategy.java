package com.troy.pattern.strategy;

/**
 * Define the payment strategy interface, all the payment should implement this
 * interface.
 * 
 * @author troyyang
 *
 */
public interface PaymentStrategy {
	public void pay(int amount);
}
