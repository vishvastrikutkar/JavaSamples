package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamsHT {

    public static void main(String[] args) {

    List<Product> products=new ArrayList<>();

        products.add(new Product("Cricket Bat",850.50,"Sports","C"));
        products.add(new Product("iPhone",1800.00,"Electronics","A"));
        products.add(new Product("Laptop",11900.00,"Electronics","B"));
        products.add(new Product("Football",2500.00,"Sports","C"));
        products.add(new Product("TV",50.00,"Electronics","D"));
        products.add(new Product("Shoes",1300.00,"Footwear","D"));
        products.add(new Product("Shirt",950.00,"Clothing","D"));


        // Predicate to verify if product price is greater than 1000
        Predicate<Product> priceGreterThan1000Predicate =(product)->product.getPrice()>1000.0;

        // Predicate to verify if product is of Electronics category
        Predicate<Product> categoryPredicate=(product)->product.getCategory().equals("Electronics");

        System.out.println("Products with price >1000 :");
        products.stream()
                .filter(priceGreterThan1000Predicate)
                .forEach(System.out::println);

        System.out.println("Products with category as Electronics :");
        products.stream()
                .filter(categoryPredicate)
                .forEach(System.out::println);

        System.out.println("Products with category as Electronics and price >1000:");
        products.stream()
                .filter(priceGreterThan1000Predicate)
                .filter(categoryPredicate)
                .peek(p -> p.setName(p.getName().toUpperCase())).toList()
                .forEach(System.out::println);

        System.out.println("Total Count of Electronics product: ");
        System.out.println(products.stream()
                .filter(categoryPredicate)
                .count());

    }

}
