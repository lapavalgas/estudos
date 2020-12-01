import java.util.ArrayList;
import java.util.List;

/**
 * Just an example of Inheritance_issue of Liskov Substitution Principle
 */
public class Inheritance_Issues_Pizza_Example{
    private List<String> toppings;
    private String size;
    private String crustStyle;

    public Inheritance_Issues_Pizza_Example(String size, String crust){
        this.toppings = new ArrayList();
        this.size = size;
        this.crustStyle = crust;
    }

    public void addTopping(String topping){
        this.toppings.add(topping);
    }

    public void bulkAddTopping(ArrayList toppingList){
        this.toppings.addAll(toppingList);
    }

    public void cook() throws InterruptedException {
        wait(10 * 6000);
    }

}

/**
 * Here are no reason to use inheritance
 */
class Pepperoni extends Inheritance_Issues_Pizza_Example {
    public Pepperoni(String size, String crust){
        super(size, crust);
        super.bulkAddTopping("pepperoni");
    }
}