package strategy;

/**
 * Created by xpollcon on 2/02/2017.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
