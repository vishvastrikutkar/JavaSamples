package Appliances;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApplianceShop {

    public static void main(String[] args) {
        Apartment myApartment = new Apartment();

        // Add appliances to the apartment
        myApartment.addAppliance(new Appliances("FAN", 1));
        myApartment.addAppliance(new Appliances("Light", 2));
        myApartment.addAppliance(new Appliances("TV", 3));
        myApartment.addAppliance(new Appliances("Laptop", 4));

        // Calculate total power consumption
        int totalPowerConsumption = myApartment.calculateTotalPowerConsumption();
        System.out.println("Total Power Consumption: " + totalPowerConsumption + " units");

        // Sort appliances by name
        myApartment.sortAppliances(new ApplianceNameComparator());
        System.out.println("Appliances sorted by name:");
        for (Appliances appliance : myApartment.getAppliances()) {
            System.out.println(appliance.getName() + " - " + appliance.getPowerConsumption() + " units");
        }

        // Sort appliances by power consumption
        myApartment.sortAppliances(new AppliancePowerComparator());
        System.out.println("Appliances sorted by power consumption:");
        for (Appliances appliance : myApartment.getAppliances()) {
            System.out.println(appliance.getName() + " - " + appliance.getPowerConsumption() + " units");
        }
    }
}

class Appliances
{
    private final String name;
    private final int powerConsumption; // Power consumption in units when switched on

    public Appliances(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

class Apartment {
    private final List<Appliances> appliances;

    public Apartment() {
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(Appliances appliance) {
        appliances.add(appliance);
    }

    public int calculateTotalPowerConsumption() {
        int totalPower = 0;
        for (Appliances appliance : appliances) {
            totalPower += appliance.getPowerConsumption();
        }
        return totalPower;
    }

    public void sortAppliances(Comparator<Appliances> comparator) {
        appliances.sort(comparator);
    }

    public List<Appliances> getAppliances() {
        return appliances;
    }
}

