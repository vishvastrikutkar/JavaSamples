package BouquetFlowers;

import java.util.ArrayList;
import java.util.List;

class Bouquet {
    /***
     * Flower Base Type enum
     */
    public enum FlowerType
    {
        ROSES(1.0),
        JASMINES(2.0),
        LILYS(3.0);

        private final double price;

        FlowerType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    private final List<FlowerType> flowerTypes;

    public Bouquet()
    {
        this.flowerTypes=new ArrayList<>();
    }

    /***
     * Add flowers to Bouquet
     * @param flowerType : flower type
     */
    public void addFlowers(FlowerType flowerType)
    {
        flowerTypes.add(flowerType);
    }

    /***
     * Calculate Bouquet Price
     * @return : Total price of the pizza
     */
    public double calculatePrice()
    {
        double bouquetPrice=0;
        for(FlowerType flowerType:flowerTypes)
        {
            bouquetPrice=bouquetPrice+flowerType.getPrice();
        }
        return bouquetPrice;
    }

}
public class BouquetShop {
    public static void main(String[] args) {

        // Get me the price of Pizza with Standard base with Mushroom toppings
        Bouquet bouquet = new Bouquet();

        bouquet.addFlowers(Bouquet.FlowerType.JASMINES);
        bouquet.addFlowers(Bouquet.FlowerType.LILYS);
        bouquet.addFlowers(Bouquet.FlowerType.ROSES);
        bouquet.addFlowers(Bouquet.FlowerType.ROSES);
        bouquet.addFlowers(Bouquet.FlowerType.ROSES);
        System.out.println("Total Price of the Bouquet is :$"+bouquet.calculatePrice());
    }

}
