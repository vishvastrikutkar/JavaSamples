package Java8;


import java.util.ArrayList;
import java.util.function.Function;


public class FunctionInterfaceHT {

    public static void main(String[] args) {

    ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Cricket Bat",850.50,"Sports","C"));
        products.add(new Product("iPhone",1800.00,"Electronics","A"));
        products.add(new Product("Laptop",90.00,"Electronics","B"));
        products.add(new Product("Football",2500.50,"Sports","C"));
        products.add(new Product("TV",50.00,"Electronics","D"));
        products.add(new Product("Shoes",1300.00,"Footwear","D"));
        products.add(new Product("Shirt",950.00,"Clothing","D"));

        Function<ArrayList<Product>,Double> calculateCost = (product)->
        {
            double totalPrice=0;
            for(Product p:product)
            {
                totalPrice=totalPrice+p.getPrice();
            }
            return totalPrice;
        };

        Function<ArrayList<Product>,ArrayList<Product>> getAllProductsWithPriceMoreThan1000 = (product)->
        {
            ArrayList<Product> list=new ArrayList<>();
            for(Product p:product)
            {
                if(p.getPrice()>1000) {
                    list.add(p);
                }
            }
            return list;
        };

        Function<ArrayList<Product>,ArrayList<Product>> getAllElectronicsProducts = (product)->
        {
            ArrayList<Product> list=new ArrayList<>();
            for(Product p:product)
            {
                if(p.getCategory().equalsIgnoreCase("Electronics")) {
                    list.add(p);
                }
            }
            return list;
        };

        /* Calculate price of all products*/
        System.out.println("Total price of all products");
        System.out.println(calculateCost.apply(products));

        /* Calculate price of all products whose price is more than 1000*/
        System.out.println("Total price of products which are pricer than 1000");
        System.out.println(calculateCost.apply(getAllProductsWithPriceMoreThan1000.apply(products)));

        /* Calculate price of all Electronics products */
        System.out.println("Total price of all Electronics products");
        System.out.println(calculateCost.apply(getAllElectronicsProducts.apply(products)));

        /* Calculate price of all Electronics products */
        System.out.println("Total price of all Electronics products");
        System.out.println(getAllProductsWithPriceMoreThan1000.apply(getAllElectronicsProducts.apply(products)));
    }
}

