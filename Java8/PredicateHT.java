package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;


public class PredicateHT {
    public static void main(String[] args) {

        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product("Cricket Bat",850.50,"Sports","C"));
        products.add(new Product("iPhone",800.00,"Electronics","A"));
        products.add(new Product("Laptop",90.00,"Electronics","B"));
        products.add(new Product("Football",2500.00,"Sports","C"));
        products.add(new Product("TV",50.00,"Electronics","D"));
        products.add(new Product("Shoes",1300.00,"Footwear","D"));
        products.add(new Product("Shirt",950.00,"Clothing","D"));

        ArrayList<Response> responses = new ArrayList<>();

        responses.add(new Response("{{..}}",200,"JSON"));
        responses.add(new Response("{[]..[]}",400,"XML"));
        responses.add(new Response("{[..]}",400,"JSON"));
        responses.add(new Response("{..}",400,"JSON"));
        responses.add(new Response("{[[[..]]]}",500,"XML"));

        System.out.println("Response Details:");
        System.out.println(responses);

        System.out.println();

        System.out.println("Product Details:");
        System.out.println(products);

        // Predicate to verify if product price is greater than 1000
        Predicate<Product> priceGreterThan1000Predicate =(product)->product.getPrice()>1000.0;
        System.out.println();

        // Predicate to verify if product price is greater than 100
        Predicate<Product> priceGreterThan100Predicate =(product)->product.getPrice()>100.0;
        System.out.println();

        // Predicate to verify if product is of Electronics category
        Predicate<Product> categoryPredicate=(product)->product.getCategory().equals("Electronics");
        System.out.println();

        // Predicate to verify if status code is 400
        Predicate<Response> statusCode400 =(response)->response.getStatusCode()==400;
        System.out.println();

        // Predicate to verify if status code is 400
        Predicate<Response> responseTypeJson =(response)->response.getResponseType().equals("JSON");
        System.out.println();

        /* Getting products with price more than 1000 using For each loop*/
        System.out.println("Products with price greater than 1000");
        for(Product p:products)
            if (priceGreterThan1000Predicate.test(p))
                System.out.println(p);

        /* Getting products of Electronics category For each loop*/
        System.out.println("Products of Electronics category");
        for(Product p:products)
            if (categoryPredicate.test(p))
                System.out.println(p);

        /* Getting products whose price is more than 100 and is of Electronic category using For each loop*/
        System.out.println("Products with more than price 100 and of Electronics category ");
        for(Product p:products)
            if (priceGreterThan100Predicate.and(categoryPredicate).test(p))
                System.out.println(p);

        /* Getting products with price more than 100 and not Electronics category using For each loop*/
        System.out.println("Products with less than price 100 and of Electronics category ");
        for(Product p:products)
            if (priceGreterThan100Predicate.negate().and(categoryPredicate).test(p))
                System.out.println(p);

        /* Get All responses with status code is 400 using For each loop*/
        System.out.println("Get All responses with status code is 400 ");
        for(Response r:responses)
                if(statusCode400.test(r))
                    System.out.println(r);

        /* Get All responses with response type JSON using For each loop*/
        System.out.println("Get All responses with response type JSON ");
        for(Response r:responses)
            if(responseTypeJson.test(r))
                System.out.println(r);

        System.out.println("Get All responses with response type JSON AND Status code 400 ");
        responses.stream().filter(statusCode400.and(responseTypeJson)).forEach(System.out::println);

        /* Get All responses with response type JSON AND Status code 400 using For each loop*/
        System.out.println("Get All responses with response type JSON AND Status code 400 ");
        for(Response r:responses)
            if(statusCode400.and(responseTypeJson).test(r))
                System.out.println(r);

        /* Get All responses with response type JSON OR Status code 400 using For each loop*/
        System.out.println("Get All responses with response type JSON OR Status code 400 ");
        for(Response r:responses)
            if(statusCode400.or(responseTypeJson).test(r))
                System.out.println(r);

        /* Get All responses with response type JSON AND Status code is not 400 using For each loop*/
        System.out.println("Get All responses with response type JSON AND Status code is not 400 ");
        for(Response r:responses)
            if(statusCode400.negate().and(responseTypeJson).test(r))
                System.out.println(r);

    }

}
