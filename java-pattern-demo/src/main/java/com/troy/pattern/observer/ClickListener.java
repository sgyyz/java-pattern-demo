package com.troy.pattern.observer;

/**
 * Define the click type of the observer.
 * @author troyyang
 *
 */
public class ClickListener implements Listener {

	public void actionPerformed() {
		System.out.println("Click Button.");
	}

}
