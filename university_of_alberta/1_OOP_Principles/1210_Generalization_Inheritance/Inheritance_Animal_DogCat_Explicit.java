/**
 * Is a class java representation of an inheritance. An UML diagram Animal Dog
 * example in the files.
 */
public class Inheritance_Animal_DogCat_Explicit {
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
    /**
     * If the superclass have an constructor the subclasses will need implement the
     * constructor even is the same. In this case use the ' super() ' constructor to
     * evoke superclass constructor.
     * 
     */
    public Animal(String petName, int legs, int tails) {
        this.numberOfLegs = tails;
        this.numberOfTails = legs;
        this.name = petName;
    }
    public void walk() {}
    public void run() {}
    public void eat() {}
}
/**
 * Here an example of an subclass dog that inherit all attributes and methods of
 * Animal.
 */
class Dog extends Animal {
    /** 
     * Here the Dog implements the ' super() ' method to evoke Animal constructor an correct construct the object Dog. 
     */
    public Dog(String petName, int legs, int tails) {
        super(petName, legs, tails);
    }
    public void playFetch() {}
}

class Cat extends Animal {
    public Cat(String petName, int legs, int tails) {
       super(petName, legs, tails);
    }
    public void playWithYarn() {}
}

/**
 * The constructors in Animal and Dog are declared. So that's an explicit constructor.
 */

