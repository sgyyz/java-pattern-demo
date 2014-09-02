Singleton Pattern
===================

###Concept
This pattern means that in your system or in the memory, there just has one and unique instance of this class.

>Ensure a class has only one instance and provide a global point of access to it.

In this pattern, the constructor should be decorated as `private`, so it ensures that the client can't new an instance which can generate more than one instance in the memory. So the singleton class provide a method for the outside to get this unique instance created by itself. As usual, we called the method as `getInstance()`.

###Example
In this example, we didn't consider the thread safety. Just show how to design the singleton pattern.

The below steps can create the singleton object:
* create the singleton class, let's create it named by `Singleton`.
* create the constructor with no parameters, and decorated by `private`.
* create the `static` variable, and the type is itself.
* create the access method named by `getInstance()`. In this method, you should return instance of the variable defined before.

Please reference the [source code](https://github.com/sgyyz/java-pattern-demo/tree/master/java-pattern-demo/src/main/java/com/troy/pattern/singleton).

*Note: the instance you can initial when you define the variable or lazy initial when call the getInstance() method.*

###Conclude
Singleton pattern can create the object itself exclusively in the memory, means each client call the `getInstance()` method get the same instance. This can be used such as the Log, connection pool and so on.

###Reference
*You can reference the thread safety singleton demo in the package which used the JLS to ensure the thread safety.*

```java
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
```
