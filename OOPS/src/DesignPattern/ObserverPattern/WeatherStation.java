package DesignPattern.ObserverPattern;

public class WeatherStation{
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 67);
        weatherData.setMeasurements(89, 70);
        weatherData.setMeasurements(69, 50);
    }
}
