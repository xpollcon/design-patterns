package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 0.69;
    }
}
