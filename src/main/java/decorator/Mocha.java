package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}
