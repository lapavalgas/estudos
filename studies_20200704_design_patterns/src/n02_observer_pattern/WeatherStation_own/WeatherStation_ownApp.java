package n02_observer_pattern.WeatherStation_own;

public class WeatherStation_ownApp {

    public WeatherStation_ownApp() {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplaty = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplayV1 StatisticsDisplayV1 = new StatisticsDisplayV1(weatherData);
        StatisticsDisplayV2 StatisticsDisplayV2 = new StatisticsDisplayV2(weatherData);
        ForecastDisplay ForecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(76, 66, 21.6f);
        weatherData.setMeasurements(80, 69, 22.7f);
        weatherData.setMeasurements(84, 76, 32.9f);

        

    }

}