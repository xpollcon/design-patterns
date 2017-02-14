package decorator;

/**
 * Created by xpollcon on 14/02/2017.
 */
public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage) {

        this.beverage=beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
