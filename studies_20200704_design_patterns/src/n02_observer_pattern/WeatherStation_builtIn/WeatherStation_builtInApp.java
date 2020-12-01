package n02_observer_pattern.WeatherStation_builtIn;

public class WeatherStation_builtInApp {

    public WeatherStation_builtInApp() {

        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(76, 66, 21.6f);
        weatherData.setMeasurements(80, 69, 22.7f);
        weatherData.setMeasurements(84, 76, 32.9f);

    }
}