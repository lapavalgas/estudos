# OOP : Generalization Interface | Expressing Design Structure

The interface also denotes a type. However, interface only declares methods signatures and no constructors, attributes or methods body. It specifies the expected behaviors in the method signatures, but does not provide any implementation details. But it is important to understand that interfaces aren't classes. They are used to describe behaviors. Is used the letter ' I ' to indicate an interface in Java. Are like an Abstract Classes, so interfaces doesn't implement.

An Abstract classes are classes that implements but doesn't instantiate.

An abstract method is an method that doesn't implement any rule.

**Multiple inheritance can be achieve by implements mutiple interfaces**

In Java we can implements how many interfaces is desired. And a interface can extends another one, but just if all methods can be reused. Is used the keyword ' implements ' to implement an interface in a java class. 

Although they are a useful technique, remember that you should not be generalizing all behavior contracts into interfaces. They are meant to fulfill a specific need, which is to provide a way for related classes to work consistently.