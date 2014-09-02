package com.troy.pattern.singleton;

public class MainAPP {
	public static void main(String[] args) {
		// Create the 2 instance singleton and use the == to check if they are
		// same.
		Singleton singleton_a = Singleton.getInstance();
		Singleton singleton_b = Singleton.getInstance();

		System.out.println(String.format("The 2 instance are %s.",
				(singleton_a == singleton_b ? "same" : "different")));
	}
}
