package n02_observer_pattern.WeatherStation_own;

import n02_observer_pattern.WeatherStation_own.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}