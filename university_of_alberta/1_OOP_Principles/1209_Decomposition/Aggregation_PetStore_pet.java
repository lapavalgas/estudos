import java.util.ArrayList;

/**
 * Is a class java representation of aggregation. An type of relationship
 * between classes.
 */
public class Aggregation_PetStore_pet {
    /**
     * This demonstrated that the PetStore 'has-a' Pet, but...
     */
    private ArrayList<Pet> pets;

    /**
     * This constructor demonstrated that the pets start empty in this constructor class.
     */
    public PetStore(){
        pets = new ArrayList<Pet>();
    }

    /**
     * This behavior demonstrated that an PetStore can add more Pets during time.
     */
    public void add(Pet pet) {
        // ...
    }

}