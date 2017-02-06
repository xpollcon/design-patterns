package observer.v1;

/**
 * Created by xpollcon on 6/02/2017.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
