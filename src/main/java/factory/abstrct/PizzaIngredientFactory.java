package factory.abstrct;

import factory.abstrct.ingredients.*;

/**
 * Created by xpollcon on 22/02/2017.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();

}

