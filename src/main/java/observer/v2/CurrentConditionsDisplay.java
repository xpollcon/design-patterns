package observer.v2;

/**
 * Created by xpollcon on 6/02/2017.
 */

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Observable observable;
    private float humidity;
    private float temperature;
    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " +
        humidity + "% humidity");
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
        }
        display();
    }
}
