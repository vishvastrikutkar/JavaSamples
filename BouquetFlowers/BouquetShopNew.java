package BouquetFlowers;

import java.util.ArrayList;
import java.util.List;

public class BouquetShopNew {

    public static void main(String [] args) {
        FlowerBouquet flowerBouquet = new FlowerBouquet();
        flowerBouquet.addFlowerToBouquet(new Rose());
        flowerBouquet.addFlowerToBouquet(new Rose());
        flowerBouquet.addFlowerToBouquet(new Lily());
        flowerBouquet.addFlowerToBouquet(new Lily());
        flowerBouquet.addFlowerToBouquet(new Jasmin());

        System.out.println("Your Bouquet total cost is: $"+flowerBouquet.calculateBanquetCost());
    }

}

class Flower
{
    private final double rate;

    public Flower(String flowerName, double flowerPrice)
    {
        System.out.println(flowerName + " added");
        this.rate= flowerPrice;
    }

    public double getRate()
    {
        return rate;
    }

    public enum FlowerType{
        ROSE,
        LILY,
        JASMIN
    }
}

class Rose extends Flower{
    public Rose()
    {
        super(String.valueOf(FlowerType.ROSE),1.0);
        System.out.print("Cost :$1");
    }
}

class Lily extends Flower{
    public Lily()
    {
        super(String.valueOf(FlowerType.LILY),2.0);
        System.out.println("Cost :$2");
    }
}

class Jasmin extends Flower{
    public Jasmin()
    {
        super(String.valueOf(FlowerType.JASMIN),3.0);
        System.out.println("Cost :$3");
    }
}

class FlowerBouquet
{
    private final List<Flower> flowers;

    public FlowerBouquet()
    {
        flowers=new ArrayList<>();
    }

    public void addFlowerToBouquet(Flower flower)
    {
        flowers.add(flower);
    }

    public double calculateBanquetCost()
    {
        double totalCost=0;
        for(Flower flower:flowers)
        {
            totalCost=totalCost+flower.getRate();
        }
        return totalCost;
    }
}