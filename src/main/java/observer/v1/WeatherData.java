package observer.v1;


import java.util.ArrayList;

/**
 * Created by xpollcon on 6/02/2017.
 */
public class WeatherData implements Subject {

    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements (float temperature, float humidity, float pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }

    public void measurementChanged(){
        notifyObservers();
    }
}
