package n02_observer_pattern.WeatherStation_own;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplayV1 implements Observer, DisplayElement {

    private List<Float> temperatures = new ArrayList<>();

    private Subject weatherData;

    public StatisticsDisplayV1(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        display();

    }

    @Override
    public void display() {
        System.out.println("V1: Avg/Max/Min temperature = " 
        + returnAvarageTemperature() + "/" 
        + returnMaxTemperature() + "/" 
        + returnMinTemperature()
        );
    }

    public Float returnAvarageTemperature() {
        Float sumTemperatures = 0.0f;
        for (int i = 0; i < this.temperatures.size(); i++) {
            Float temperature = this.temperatures.get(i);
            sumTemperatures += temperature;
        }
        return sumTemperatures / this.temperatures.size();
    }

    public Float returnMaxTemperature() {
        Float maxTemperature = -1.0f;
        for (int i = 0; i < this.temperatures.size(); i++) {
            Float temperature = this.temperatures.get(i);
            if (maxTemperature <= temperature) {
                maxTemperature = temperature;
            }
        }
        return maxTemperature;
    }

    public Float returnMinTemperature() {
        Float minTemperature = 1000.0f;
        for (int i = 0; i < this.temperatures.size(); i++) {
            Float temperature = this.temperatures.get(i);
            if (minTemperature >= temperature) {
                minTemperature = temperature;
            }
        }
        return minTemperature;
    }

}