package Behavioral.Observer;

/*
The Observer Pattern defines a one-to-many dependency, where when one object changes state, all its dependents are notified.
 */

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature, float humidity);
}

// Concrete Observer: MobileApp
class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(float temperature, float humidity) {
        System.out.println(appName + " received weather update: Temperature = "
          + temperature + ", Humidity = " + humidity);
    }
}

// Subject Interface
interface WeatherStation {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject: WeatherStationImpl
class WeatherStationImpl implements WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    // Update weather data and notify observers
    public void setWeatherData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}


public class ObserverExample {
    public static void main(String[] args) {
        WeatherStationImpl weatherStation = new WeatherStationImpl();

        Observer mobileApp1 = new MobileApp("WeatherApp1");
        Observer mobileApp2 = new MobileApp("WeatherApp2");

        weatherStation.addObserver(mobileApp1);
        weatherStation.addObserver(mobileApp2);

        weatherStation.setWeatherData(30.5f, 65.0f);
        weatherStation.setWeatherData(28.3f, 70.0f);
    }

}
