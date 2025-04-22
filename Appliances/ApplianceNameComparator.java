package Appliances;

import java.util.Comparator;

public class ApplianceNameComparator implements Comparator<Appliances> {
    @Override
    public int compare(Appliances a1, Appliances a2) {
        return a1.getName().compareTo(a2.getName());
    }
}

