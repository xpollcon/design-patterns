package observer.v1;

/**
 * Created by xpollcon on 6/02/2017.
 */
public class WeatherStation {
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,78, 29.4f);
        weatherData.setMeasurements(78,90, 29.2f);

    }
}
