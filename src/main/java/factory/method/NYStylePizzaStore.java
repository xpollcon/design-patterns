package factory.method;

/**
 * Created by xpollcon on 21/02/2017.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else if (type.equals("clam")){
            return new NYStyleClamPizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else return null;
    }
}
