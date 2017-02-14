package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public class Soy extends CondimentDecorator {
   Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    public double cost() {
        return beverage.cost() + 0.80;
    }
}
