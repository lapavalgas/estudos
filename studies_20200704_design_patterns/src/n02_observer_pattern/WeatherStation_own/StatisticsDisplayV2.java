package n02_observer_pattern.WeatherStation_own;

public class StatisticsDisplayV2 implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    private Subject weatherData;

    public StatisticsDisplayV2(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;
        tempSum += temperature;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("V2: Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp
                + "/" + minTemp);
    }
}