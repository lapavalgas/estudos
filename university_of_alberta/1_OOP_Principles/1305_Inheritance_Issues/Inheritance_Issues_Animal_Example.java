

/**
 * Just an example of Inheritance_issue of simply share
 */
public class Inheritance_Issues_Animal_Example {
    private int numberOfLegs;
    private boolean hasTail;
    /* Other characteristics of an animal can be included here */

    public Animal(int legs, boolean tail){
        this.numberOfLegs = legs;
        this.hasTail = tail;
    }

    public void walk() {}
    public void run() {}
    public void eat() {}
    /* other behaviors of an animal can be included here */
}

/**
 * The Liskov Substitution Principle is violated here, because the whale class overrides the animals classes running and walking functions and replaces them with swimming behaviors. The whale no longer behaves in the way we would expect it superclass to behave.
 */
class Whale extends Inheritance_Issues_Animal_Example {
    public Whale() {
        super(0, true);
    }

    private void swim() {}
    private void run() {
        this.swim();
    }
    private void walk() {
        this.swim();
    }
}