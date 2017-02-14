package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public abstract class Beverage {

    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
