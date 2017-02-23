package factory.method;

import java.util.ArrayList;

/**
 * Created by xpollcon on 21/02/2017.
 */
public class Pizza {

    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + "...");
        System.out.println("Adding " + sauce + "...");
        for (String topping : toppings) {
            System.out.println("Adding " + topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
