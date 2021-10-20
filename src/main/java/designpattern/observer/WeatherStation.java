package designpattern.observer;

import designpattern.observer.observer.CurrentConditionDisplay;
import designpattern.observer.observer.ForecastDisplay;
import designpattern.observer.observer.HeatIndexDisplay;
import designpattern.observer.observer.StatisticsDisplay;
import designpattern.observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
