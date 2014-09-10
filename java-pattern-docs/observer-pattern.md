Observer Pattern
===================

###Concept
In this pattern, we should understand the **Subject**, **Observer** firstly.

* **Subject** is a similar content which need to be implemented. Such as the `JButton` in `javax.swing`, this is one of the GUI components implementation.
* **Observer** is a watcher, watch the **Subject**'s changes, such as the status, data change and so on. In the GUI, we always add the `Listener` on our components, in order to provide the event response. 

This pattern is used wildly in the responsive functions, such as the GUI event response, feedback to user when your data has changed, this more like a **trigger**. It can handle the familiar **Observer**s in on place. It can make the code decoupling and more easy to maintain.

###Example
In this example, it will simulate the Button add Listener. To match the `OO` principle, we should design the **Subject** and **Observer**.

####Subject
It's a set of common things. So we define the common subject as an abstract class will be better. 
* First define an abstract class named `Component`. 
* In this class, we should define a list to store the **Observer**s. Like the `JButton`, it can add and remove the **Observer**s. So define `addListener()`, `removeListener` two methods to handle these function. Cause all the `Component`s have the two methods, so add the method body in the functions.
* When the `Component` changes it status or need notify the **Observer**s, it should call the **Observer**'s action method. So here we define a method named `doAction()`.
* The subclass of `Component` will implement `doAction()` to call the actions you should do in the **Observer**s.

####Observer
It's the role which should performance the actions when the **Subject** changed its status.
* First define an interface named `Listener`.
* Define the action it will perform named `actionPerformed()`, which like the Listener method in the GUI.
* All of the observer should be the subclass of `Listener`, so just implement the interface and overrride the `actionPerformed()` method. 

Please reference the [source code](https://github.com/sgyyz/java-pattern-demo/tree/master/java-pattern-demo/src/main/java/com/troy/pattern/observer).

###Reference
The example of using the Observer Pattern.

```java
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
```
