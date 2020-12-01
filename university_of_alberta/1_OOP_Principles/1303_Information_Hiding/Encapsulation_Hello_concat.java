
/*
 * Is a class java representation of an encapsulation.
 */
public class Encapsulation_Hello_concat {{
    String a = "Hello";
    /**
     * We do not need to know how concat is implemented, because may change. We just need to know how to use, how interact with this method with this interface.
     */
    String b = a.concat(a);
}

/**
 * Take a look at this example, the string library has a method called concat. But how is it implemented? Are there extra data structures being used? Or other method calls being made that we do not have access to? As a user of the library you are given access to the concat nation functionality through an interface, a particular method signature. But you are not shown how the functionality is implemented. That is because the implementation may change and you should not depend on how it actually works. The interface establishes the only assumptions you can rely on. Attributes can also be hidden in order to prevent critical information of a classroom being changed directly. 
 */