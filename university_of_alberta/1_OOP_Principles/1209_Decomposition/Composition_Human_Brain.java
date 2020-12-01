
/**
 * Is a class java representation of a composition. An type of relationship
 * between classes.
 */

public class Composition_Human_Brain {
    /**
     * This demonstrated that the Human 'has-a' Brain..
     */
    private Brain brain;

    /**
     * This constructor demonstrated that the Human Brain is created inside and together this class.
     */
    public Human(){
        brain = new Brain();
    }

}