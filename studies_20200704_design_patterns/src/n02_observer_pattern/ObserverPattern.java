package n02_observer_pattern;

import n02_observer_pattern.SportLobby.SportLobbyApp;
import n02_observer_pattern.SportLobby_builtIn.SportLobbyApp_builtIn;
import n02_observer_pattern.SwingButtonObserver.SwingButtonObserverApp;
import n02_observer_pattern.WeatherStation_builtIn.WeatherStation_builtInApp;
import n02_observer_pattern.WeatherStation_own.WeatherStation_ownApp;

public class ObserverPattern {

    public ObserverPattern() {

        System.out.println("\nWeatherStation_ownApp.java");
        new WeatherStation_ownApp();

        System.out.println("\nWeatherStation_BuiltInApp.java");
        new WeatherStation_builtInApp();

        System.out.println("\nSwingButtonObserverApp.java");
        new SwingButtonObserverApp();

        System.out.println("\nSportLobby.java");
        new SportLobbyApp();

        System.out.println("\nSportLobby_builtIn.java");
        new SportLobbyApp_builtIn();

    }

}
