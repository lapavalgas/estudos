/**
 * Is a class java representation of an inheritance. An UML diagram Animal Dog
 * example in the files.
 */
public class Inheritance_Animal_Dog_Implicit {
    Animal dog = new Dog();
    Dog otherDog = new Dog();
}
/**
 * Here an example of an superclass.
 */
class Animal {
    protected int numberOfLegs;
    protected int numberOfTails;
    protected String name;

    public void walk() {}
    public void run() {}
    public void eat() {}
}

class Dog extends Animal {
    public void playFetch() {}
}

/**
 * The constructors in Animal and Dog aren't declared. So that's an implicit constructor. Here we use an Default constructor.
 */