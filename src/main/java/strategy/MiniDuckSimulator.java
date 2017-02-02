package strategy;

/**
 * Created by xpollcon on 2/02/2017.
 */
public class MiniDuckSimulator {
    public static void main (String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }


}
