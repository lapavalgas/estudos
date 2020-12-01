import java.util.ArrayList;

/**
 * Is a class java representation of aggregation. An type of relationship
 * between classes.
 */
public class Aggregation_Airline_CrewMember {

    /**
     * This demonstrated that the Airline 'has-a' CrewMember, but...
     */
    private ArrayList<CrewMember> crew;

    /**
     * This constructor demonstrated that the CrewMembers start empty in this constructor class.
     */
    public AirLine(){
        crew = new ArrayList<CrewMember>();
    }

    /**
     * This behavior demonstrated that an Airline can add more CrewMembers during
     * time.
     */
    public void add(CrewMember crewMember) {
        // ...
    }

}