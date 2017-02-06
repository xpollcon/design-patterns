package observer.v1;

/**
 * Created by xpollcon on 6/02/2017.
 */
public interface Subject {
    void registerObserver (Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
