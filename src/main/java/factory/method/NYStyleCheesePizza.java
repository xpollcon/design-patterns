package factory.method;

/**
 * Created by xpollcon on 22/02/2017.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marina Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
