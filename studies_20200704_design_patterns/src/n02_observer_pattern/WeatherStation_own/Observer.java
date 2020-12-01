package n02_observer_pattern.WeatherStation_own;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}