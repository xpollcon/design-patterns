package factory.abstrct;

import factory.abstrct.ingredients.Pepperoni;

/**
 * Created by xpollcon on 22/02/2017.
 */
public class PepporoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepporoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
