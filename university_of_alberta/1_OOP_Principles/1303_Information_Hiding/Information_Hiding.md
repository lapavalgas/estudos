# Information Hiding : encapsulation | Design Principles

Information hiding allows models of our system to give others the minimum amount of information needed to use them correctly and hide everything else. Information hiding allows a developer to work on a module separately with other developers needing to know the implementation details of this module. They can only use this module through its interface. 

In general things that might change, like **implementation details, should be hidden**. 

And things that should not change, like **assumptions, are revealed through interfaces**.

We use **encapsulation** to bundle attributes and behaviors into their appropriate class, and **expose an interface to provide access**. Encapsulation effectively hides the implementation of behaviors since the only access is through an interface of specific methods. Other classes can only rely on the information in these method signatures not the underlying implementations. Information hiding through encapsulation allows us to change the implementation without changing the expected outcome. We can still fulfill the expectations for a behavior without exposing how we get there.
-- ---- --
**Access modifiers** change which classes are able to access attributes and behaviors. They also determine which attribute and behaviors a superclass will share with its subclasses.

**Packages** are the means by which Java organizes related classes into a single namespace. 

**public**: public access modifier are accessible by any class in your system. Public methods are also accessible by any class in your system. But this access does not allow other classes to change the implementation of the behavior for the method. A publicly accessible methods simply allows other classes to call the method and receive any output from it.

**protected**: Protected behaviors and attributes are not accessible to every class in the system. They are only available to the encapsulating class itself, all subclasses, and classes within the same package.

**default**: default access modifier will only allow access to attributes and methods to subclasses and to the encapsulating class. This access modifier is also called the no modifier access because you do not need to explicitly declare it.

**private**: Private attributes and methods are not accessible by any class other than by the encapsulating class itself. This means these attributes cannot be accessed directly and these methods cannot be invoked by any other classes. 
-- ---- --
**Information hiding** is a powerful idea. You control what information you want to share and what behaviors you want to let others see. You reveal assumptions through interfaces that others can rely on and hide changeable things like implementation details. Information hiding allows you to build flexible, reusable, and maintainable systems.