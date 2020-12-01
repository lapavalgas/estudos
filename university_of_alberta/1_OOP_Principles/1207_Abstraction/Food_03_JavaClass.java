import java.util.Date;

/**
 * Is a class java representation of CRC and UML diagram Food example in the files.
 * Just to exemplify the abstraction concept from dialogs, to CRC Cards, to UML Class 
 * and finally to Java class.   
 */

public class Food_03_JavaClass {

    String groceryID;
    String name;
    String manufacturer;
    Date expiryDate;
    double price;

    boolean isOnSale(){
        return false;
    }
    
}