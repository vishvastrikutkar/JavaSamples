package Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionInterfaceHT {

    public static void main(String[] args) {

        BiFunction<String,Double,Product> createProduct=(name,price)->
                new Product(name,price,"Clothing","Premium");

        BiFunction<Product,Integer,Double> calculateCost=(product,qty)->
                product.getPrice()*qty;

        BiFunction<HashMap<Product,Integer>,BiFunction<Product,Integer,Double>,Double> cartCost=(map, cost)->
        {
            double totalCost=0;
            for(Map.Entry<Product,Integer> entry: map.entrySet())
                totalCost = totalCost + cost.apply(entry.getKey(),entry.getValue());
            return totalCost;

        };

        ArrayList<Product> products = new ArrayList<>();
        products.add(createProduct.apply("iPhobne", 50000.00));
        products.add(createProduct.apply("google Phone", 40000.00));
        products.add(createProduct.apply("Oppo", 30000.00));

        System.out.println(products);

        int qty=3;
        System.out.println("Total Cost for "+qty +"*"+ products.getLast().getName()+" = "+calculateCost.apply(products.getLast(),3));

        HashMap<Product,Integer> cart =new HashMap<>();
        cart.put(createProduct.apply("iPhone", 50000.00),2);
        cart.put(createProduct.apply("google Phone", 40000.00),1);
        cart.put(createProduct.apply("Oppo", 30000.00),1);

        System.out.println("Cart :"+ cart);
        System.out.println("Total cost of the cart is "+cartCost.apply(cart,calculateCost));
    }
}
