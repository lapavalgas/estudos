/**
 * Is a class java representation of an interface. To example multiple implements.
 */
public class Interface_Java_Multiple_Implements {

    /**
     * instantiate an interface by Person class.
     * Can't use the new Person to instantiate the next interface.
     */
    IPublicSpeaking personPublic = new Person(); //can't do: =personPrivate;
    IPrivateConversation personPrivate = new Person(); // can't do: = personPublic;

    /**
     * But an Person can instantiate both interface any time.
     */
    Person justPerson = new Person();
    IPublicSpeaking personPublicByJust = justPerson;
    IPrivateConversation personPrivateByJust = justPerson;

    /**
     * But is important remember that another classes can instantiate that's interfaces too.
     */
}
interface IPublicSpeaking {
    public void givePresentation();
    public void speak();
}
interface IPrivateConversation {
    public void lowerVoiceVolume();
    public void speak();
}
/**
 * This is a example of an Java class that implement two interfaces.
 */
class Person implements IPublicSpeaking, IPrivateConversation {
    public void speak(){
        System.out.println("This is fine");
    }

    @Override
    public void lowerVoiceVolume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void givePresentation() {
        // TODO Auto-generated method stub

    }
}