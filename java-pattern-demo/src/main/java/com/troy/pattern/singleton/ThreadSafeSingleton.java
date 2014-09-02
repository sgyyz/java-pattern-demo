package com.troy.pattern.singleton;

/**
 * Thread Safety singleton class
 * @author troyyang
 *
 */
public class ThreadSafeSingleton {
	
	/**
	 * Also use the private to decorated the constructor.
	 */
	private ThreadSafeSingleton() {
		
	}
	
	/**
	 * The static inner class can ensure the it's unique by the JLS.
	 * @author troyyang
	 *
	 */
	private static class SingletonHolder {
		// ensure this instance can't be changed.
		public static final ThreadSafeSingleton _INSTANCE = new ThreadSafeSingleton();
	}
	
	/**
	 * The access method
	 * @return
	 */
	public static ThreadSafeSingleton getInstance() {
		return SingletonHolder._INSTANCE;
	}
}
