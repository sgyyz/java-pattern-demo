package com.troy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>Component</code> defines the component's common attribute and defines
 * the <code>Listener</code> list.
 * 
 * @author troyyang
 *
 */
public abstract class Component {
	// The Listener list
	private List<Listener> observers = new ArrayList<Listener>();

	/**
	 * Add the listener which act as the observer.
	 * 
	 * @param listener
	 */
	public void addListener(Listener listener) {
		this.observers.add(listener);
	}

	/**
	 * remove the listener which act as the observer.
	 * 
	 * @param listener
	 */
	public void deleteListener(Listener listener) {
		this.observers.remove(listener);
	}

	public abstract void doAction();

	public List<Listener> getListeners() {
		return this.observers;
	}

}
