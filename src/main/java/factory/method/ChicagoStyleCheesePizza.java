package factory.method;

/**
 * Created by xpollcon on 22/02/2017.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Sheredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
