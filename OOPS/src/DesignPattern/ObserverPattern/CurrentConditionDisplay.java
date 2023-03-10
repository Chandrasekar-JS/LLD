package DesignPattern.ObserverPattern;

public class CurrentConditionDisplay implements Observer, DisplayElements{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature= weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition is " +temperature +"F degree "
        +humidity+"% humidity");
    }
}
