package Java8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierHT {

    public static void main(String[] args) {

        ArrayList<Product> products=new ArrayList<>();

        Supplier<Product> randomProductGenerator =() ->
        {
            String[] names ={"TV","Mobile","Shirt","Shoes","Football"};
            String[] categories ={"Electronics","Clothing","Sports","Footwear"};
            String[] grades ={"A","B","C","D"};
            Random random = new Random();
            String name=names[random.nextInt(names.length)];
            String category=categories[random.nextInt(categories.length)];
            double price=random.nextDouble(550,8000);
            String grade=grades[random.nextInt(grades.length)];
            return new Product(name,price,category,grade);
        };

        Supplier<String> OTPGenerator =()->{
            Random random = new Random();
            return String.valueOf(random.nextInt(4999)+1000);
        };

        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(randomProductGenerator.get());
        products.add(new Product("Mobile",4500.50,"Sports","C"));
        products.add(new Product("TV",1550.00,"Electronics","D"));

        Consumer<String> printConsumer = (printType)->{
            if ("file".equalsIgnoreCase(printType)) {
                try (FileWriter writer = new FileWriter("products.log", true)) {
                    writer.write(products + "\n");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println(products);
            }
        };

        Consumer<Product> upgradeGrade = (product)->{
             if(product.getPrice()>1000) {
                 product.setGrade("Premium");
                 System.out.println(product);
             }
            };

        Consumer<Product> updateProductName=(product)->{
             if(product.getPrice()>3000)
                {
                    product.setName(product.getName()+"*");
                    System.out.println(product);
                }
            };

        Consumer<Product> displayPremiumProductsWithStar=(product)->{
             if(product.getGrade().equalsIgnoreCase("Premium") && product.getName().endsWith("*"))
                    System.out.println(product);
            };


        System.out.println("Write product details to console");
        printConsumer.accept("console");

        System.out.println("Write product details to file");
        printConsumer.accept("file");

        System.out.println("Update Grade of the product to Premium if price is >1000");
        products.forEach(upgradeGrade);

        System.out.println("Update product name if price is >3000");
        products.forEach(updateProductName);

        System.out.println("Print all premium products whose name is suffixed with *");
        products.forEach(displayPremiumProductsWithStar);

        System.out.println("OTP Generated : "+OTPGenerator.get());

    }
}
