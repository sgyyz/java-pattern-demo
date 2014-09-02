package com.troy.pattern.singleton;

/**
 * This singleton didn't consider thread safety.
 * 
 * @author troyyang
 *
 */
public class Singleton {
	private static Singleton _INSTANCE;

	/**
	 * Important for the singleton pattern, constructor must be decorated by
	 * private. Also apply for all the constructor no matter with parameter or
	 * not.
	 */
	private Singleton() {

	}

	/**
	 * Define the access method.
	 * 
	 * @return
	 */
	public static Singleton getInstance() {

		// Use the lazy load way to create the instance.
		if (_INSTANCE == null) {
			_INSTANCE = new Singleton();
		}

		return _INSTANCE;
	}
}
