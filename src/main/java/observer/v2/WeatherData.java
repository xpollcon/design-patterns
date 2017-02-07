package observer.v2;


import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by xpollcon on 6/02/2017.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void setMeasurements (float temperature, float humidity, float pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }
}
