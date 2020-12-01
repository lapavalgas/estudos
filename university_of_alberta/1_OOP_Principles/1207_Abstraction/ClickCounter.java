
/**
 * Is a class java representation of UML diagram ClickCounter example in the files.
 * Just to exemplify the abstraction concept from dialogs, to CRC Cards, to UML Class 
 * and finally to Java class.   
 */

public class ClickCounter {
    private int count;

    public ClickCounter(){
        count = 0;
    }

    public void click() {
        count++;
    }

    public void setClickCount(int clickCount){
        count = clickCount;
    }

    public int getClickCount(){
        return count;
    }

}