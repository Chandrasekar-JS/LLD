package DesignPattern.ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> Observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData(){
        Observers = new ArrayList<>();
    }
    public void registerObserver(Observer o){
        Observers.add(o);
    }
    public void removeObserver(Observer o){
        Observers.remove(o);
    }
    public void notifyObserver(){
        for(Observer Observer : Observers){
            Observer.update();
        }
    }
    public void measurementChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        measurementChanged();
    }
    public float getTemperature(){
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
}
