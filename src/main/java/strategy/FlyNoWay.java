package strategy;

/**
 * Created by xpollcon on 2/02/2017.
 */
public class FlyNoWay implements  FlyBehavior{
    public void fly() {
        System.out.println("I can't fly");
    }
}
