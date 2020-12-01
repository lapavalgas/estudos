# Inheritance Issues | Generalization Principles

The bad inheritance use are:

**1.:** ask: am I using inheritance to simply share attributes or behavior without further adding anything special in my subclasses? If the answer is yes, then you're misusing inheritance. If the answer is yes, then you're misusing inheritance. Because no point to the subclasses to exist.

**2.:** look: if you break the Liskov Substitution Principle Liskov Substitution Principle: The principle states that a subclass can replace a superclass, if and only if, the subclass does not change the functionality of the superclass. How would this principle be violated through inheritance?
```
An example of bad inheritance can be seen in the Java Collections Library. Have you ever used the stack class in Java? A stack is understood as first in and last out data structure. It has a small number of well defined behaviors like peak, pop and push. This is not the case in the Java stack class, because the stack class inherits from the vector class. This means that the stack class is able to return an element at a specified index, retrieve the index of an element and even insert an element into a specific index. These are not behaviors expected from a stack, but because of poor use of inheritance, they are allowed in Java. 
```
Remember, that a common goal is to build reusable, flexible, and maintainable systems. 

Inheritance is simply one technique to help you reach that goal. It is important to understand that a technique is beneficial when used properly, but can cause headaches if not.