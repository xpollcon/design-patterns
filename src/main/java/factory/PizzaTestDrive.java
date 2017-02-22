package factory;

/**
 * Created by xpollcon on 22/02/2017.
 */
public class PizzaTestDrive {
    public static void main(String args[]){
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("----------------------------------");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
