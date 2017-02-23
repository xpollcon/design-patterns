package factory.abstrct;

/**
 * Created by xpollcon on 21/02/2017.
 */

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (type.equals("pepperoni")){
            //return new PepporoniPizza(ingredientFactory);
        }else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if (type.equals("veggie")){
            //return new VeggiePizza(ingredientFactory);
        }

        return pizza;
    }


}
