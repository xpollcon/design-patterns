package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 0.79;
    }
}
