package factory.abstrct;

import factory.abstrct.ingredients.*;

/**
 * Created by xpollcon on 21/02/2017.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }
}
