package n02_observer_pattern.SportLobby;

import java.util.concurrent.Flow.Subscriber;

public interface Subject {

    public void subscribeObserver(Observer observer);
    public void unSubscribeObserver(Observer observer);
    public void notifyObservers();
    public String subjectDetails();
    
}