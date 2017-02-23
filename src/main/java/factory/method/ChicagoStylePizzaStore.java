package factory.method;

/**
 * Created by xpollcon on 21/02/2017.
 */

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else return null;
    }


}
