package com.troy.pattern.strategy;

public class PaypalPayment implements PaymentStrategy {
	private String emailId;
	private String password;

	public PaypalPayment(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	/**
	 * The specific logic you should use when do the payment by Paypal.
	 * 
	 * @param amount
	 *            The payment amount
	 */
	public void pay(int amount) {
		System.out
				.println(String.format("Pay %d by your Paypal.", amount));
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
