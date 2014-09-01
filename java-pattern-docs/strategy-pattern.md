Strategy Pattern
===================

This document explains what is the strategy pattern and shows a common example to prove this pattern.

The **Strategy Pattern** is a pattern to handle the different logic when handle the same question. Such as the payment after you buy things.

In many cases we should handle our logic within the core class, we may use the `switch` or the `if...else` to do these things. But as our business domain or the logic expand, we should add more different ways to handle the same question, such as the payment by using Credit Card, Paypal and other payment ways. As usual, we may define a `PaymentOperation` class to handle the different payment methods by using `switch` or `if...else`. And add the logic in the `switch` or in the `if...else` block.This is the common way.

Think about it, if we add more than one payment way, or if we change the logic in the pay method, we may change more code in different class. And it's not match the `OO` design - **high cohesion** and **low coupling**, so the **Strategy Pattern** is born.

**Note**:*Java Pattern don't suit the controller logic in the JEE, but the original controller may suit the Java Pattern, so don't use this point to explain the logic in your controller*

###Example of Payment

In most sales Websites, it supports different ways after you choose your things. So firstly define the common interface for payment called `PaymentStrategy` with `pay(int amount)` method. Then we should define the different payment ways based on this interface, such as `CreditCardPayment`, `PaypalPayment` and other payment ways. In the different payment implementation class, each can define different fields and constructor, and the subclass should override the `pay(int amount)` method to handle its logic, this can show the different from each payment way.

Above are the **Strategy Pattern** core part. After these finished, we can define the `Item` class and `ShoppingCart` to simulate the shopping process. Especially, in the `ShoppingCart`, there is a method `pay(PaymentStrategy strategy)` to invoke the `pay(int amount)` method. Here you can see, that we just pass the implementation class of `PaymentStrategy`, and the `ShoppingCart`'s `pay(PaymentStrategy strategy)` ignore the implementation.

###Conclude

In the example, we can find that we had done the **high cohesion** and **low coupling**. In the future, if there need to add more payment ways, we just create the implementation class of `PaymentStrategy`, and when we should use this payment way, just pass its instance to `ShoppingCart`'s `pay(PaymentStrategy strategy)`.

####Reference

*In the reference package of the strategy pattern, you can find Strategy Pattern in the JDK.*