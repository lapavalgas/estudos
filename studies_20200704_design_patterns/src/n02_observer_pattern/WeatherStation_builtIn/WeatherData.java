package n02_observer_pattern.WeatherStation_builtIn;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

        /**
         * Behind the scenes
         * The pseudo code java.util.Observable
         */
        // setChanged() {
        //     changed = true
        // }

        // notifyObservers(Object arg) {
        //     if (changed) {
        //     for every observer on the list {
        //     call update (this, arg)
        //     }
        //     changed = false
        //     }
        // }

        // notifyObservers() {
        //     notifyObservers(null)
        // }
        
    public void measurementsChanged() {
            setChanged();
            notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}