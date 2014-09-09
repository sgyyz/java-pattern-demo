package com.troy.pattern.observer;

public class MainAPP {
	public static void main(String[] args) {
		Button button = new Button();

		// Use the subclass of the <code>Listener</code> as the observer.
		button.addListener(new ClickListener());

		// Use the anonymous inner type as the observer. Here define the double
		// click listener. Such as we use the <code>JButton</code>
		button.addListener(new Listener() {
			public void actionPerformed() {
				System.out.println("Dobule Click.");
			}
		});
		
		// trigger the actions in the observer list.
		button.doAction();
	}
}
