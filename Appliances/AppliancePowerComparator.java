package Appliances;

import java.util.Comparator;

public class AppliancePowerComparator implements Comparator<Appliances> {
    @Override
    public int compare(Appliances a1, Appliances a2) {
        return Integer.compare(a1.getPowerConsumption(), a2.getPowerConsumption());
    }
}
