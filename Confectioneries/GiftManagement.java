package Confectioneries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GiftManagement {
    public static void main(String[] args)
    {
        Gift gift=new Gift();
        Scanner scanner=new Scanner(System.in);
        gift.addConfectionery(new Chocolate("Kitkat",35,"Nestle"));
        gift.addConfectionery(new Chocolate("Dairy Milk",50,"Cadbury"));
        gift.addConfectionery(new Chocolate("FiveStar",25,"Nestle"));
        gift.addConfectionery(new Chocolate("Eclairs",5,"abc"));
        gift.addConfectionery(new Sweet("Burfi",45));

        System.out.println("----------------------------------------------------");
        System.out.println("Total weight of the confectionary is "+gift.getTotalWeight());

        System.out.println("Choose an option:");
        System.out.println("1. Sort By Name");
        System.out.println("2. Sort By Weight");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                gift.sortChocolatesByName();

                System.out.println("Sorting based on Name :");
                System.out.println("----------------------------------------------------");
                for (Confectioneries item : gift.getConfectioneries()) {
                    if (item instanceof Chocolate) {
                        System.out.println(item.getName());
                    }
                }
                break;
            case 2:
                gift.sortChocolatesByWeight();
                System.out.println("Sorting based on Weight :");
                System.out.println("----------------------------------------------------");
                for (Confectioneries item : gift.getConfectioneries()) {
                    if (item instanceof Chocolate) {
                        System.out.println(item.getName());
                    }
                }
                break;
            case 3:
                System.out.println("Exiting....");
                break;
        }

        System.out.println("Enter the weight range");
        System.out.println("Enter minimum weight:");
        int minWeight= scanner.nextInt();

        System.out.println("Enter maximum weight:");
        int maxWeight = scanner.nextInt();

        scanner.close();

        List<Confectioneries> itemsInRange = gift.findConfectioneriesByWeightInRange(minWeight, maxWeight);
        System.out.println("----------------------------------------------------");
        System.out.println("Confectioneries within weight range " + minWeight + "g - " + maxWeight + "g:");
        for (Confectioneries candy : itemsInRange) {
            System.out.println(candy.getName() + " - " + candy.getWeight() + "g");
        }
    }
}

abstract class Confectioneries
{
    private final double weight;
    private final String name;
    public Confectioneries(String name,double weight)
    {
        this.name=name;
        this.weight=weight;
    }
    public double getWeight()
    {
        return weight;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();
}

class Chocolate extends Confectioneries
{
    private final String brand;
    public Chocolate(String name,double weight,String brand) {
        super(name,weight);
        this.brand=brand;
    }

    public String getBrand()
    {
        return brand;
    }

    @Override
    public String getType() {
        return "Chocolate";
    }
}

class Sweet extends Confectioneries
{
    public Sweet(String name,double weight) {
        super(name,weight);
    }

    @Override
    public String getType() {
        return "Sweet";
    }
}

class Gift {
    private final List<Confectioneries> confectioneries;

    public Gift()
    {
        confectioneries=new ArrayList<>();
    }

    public void addConfectionery(Confectioneries confectionery)
    {
        confectioneries.add(confectionery);
    }

    public double getTotalWeight()
    {
        double totalWeight=0;
        for(Confectioneries con:confectioneries)
        {
            totalWeight=totalWeight+con.getWeight();
        }
        return totalWeight;
    }
    public List<Confectioneries> getConfectioneries()
    {
        return confectioneries;
    }

    public void sortChocolatesByName() {
        confectioneries.sort(Comparator.comparing(
                confectionery -> (confectionery instanceof Chocolate) ? confectionery.getName() : ""));
    }

    public void sortChocolatesByWeight() {
        confectioneries.sort((c1, c2) -> {
            return Double.compare(c1.getWeight(), c2.getWeight());
        });
    }

    public List<Confectioneries> findConfectioneriesByWeightInRange(double minWeight, double maxWeight) {
        List<Confectioneries> result = new ArrayList<>();
        for (Confectioneries item : confectioneries) {
            if (item.getWeight() >= minWeight && item.getWeight() <= maxWeight) {
                result.add(item);
            }
        }
        return result;
    }

}




