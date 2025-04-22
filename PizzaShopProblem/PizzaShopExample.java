package PizzaShopProblem;

import java.util.ArrayList;
import java.util.List;

class Pizza {

    /***
     * Pizza Base Type enum
     */
    public enum PizzaBaseType
    {
        STANDARD(20.0),
        WHEAT(40.0),
        SOFT(30.0);

        private final double price;

        PizzaBaseType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    /***
     * Pizza Toppings Enum
     */
    public enum PizzaToppingsType
    {
        TOMATO(2.0),
        OLIVE(1.0),
        MUSHROOMS(3.0);

        private final double price;

        PizzaToppingsType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

    }

    private final PizzaBaseType baseType;
    private final List<PizzaToppingsType> toppings;

    public Pizza(PizzaBaseType base)
    {
     this.baseType=base;
     this.toppings=new ArrayList<>();
    }

    /***
     * Add Toppings to Pizza
     * @param topping : Topping type
     */
    public void addTopping(PizzaToppingsType topping)
    {
        toppings.add(topping);
    }

    /***
     * Calculate pizza Price
     * @return : Total price of the pizza
     */
    public double calculatePrice()
    {
        return getBasePrice()+getToppingPrice();
    }

    /***
     * Get the Price of the Pizza base
     * @return : Price of the pizza base
     */
    public double getBasePrice()
    {
          return baseType.getPrice();
    }

    /***
     * Get the Toppings Price for Pizza
     * @return Price of the pizza topping
     */
    public double getToppingPrice()
    {
        double toppingsPrice=0;
        for(PizzaToppingsType topping:toppings)
        {
            toppingsPrice=toppingsPrice+topping.getPrice();
        }
        return toppingsPrice;
    }

}

public class PizzaShopExample {
    public static void main(String[] args) {

        // Get me the price of Pizza with Standard base with Mushroom toppings
        Pizza pizza = new Pizza(Pizza.PizzaBaseType.STANDARD);
        pizza.addTopping(Pizza.PizzaToppingsType.MUSHROOMS);
        System.out.println(pizza.calculatePrice());

        // Get me the price of Pizza with Soft base with Olive and mushroom toppings
        pizza = new Pizza(Pizza.PizzaBaseType.SOFT);
        pizza.addTopping(Pizza.PizzaToppingsType.MUSHROOMS);
        pizza.addTopping(Pizza.PizzaToppingsType.OLIVE);
        System.out.println(pizza.calculatePrice());

        // Get me the price of Pizza with Soft base with Tomato ,Olive and mushroom toppings
        pizza = new Pizza(Pizza.PizzaBaseType.WHEAT);
        pizza.addTopping(Pizza.PizzaToppingsType.OLIVE);
        pizza.addTopping(Pizza.PizzaToppingsType.MUSHROOMS);
        pizza.addTopping(Pizza.PizzaToppingsType.TOMATO);
        System.out.println(pizza.calculatePrice());
    }

}
