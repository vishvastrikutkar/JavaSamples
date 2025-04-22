package Java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDescendingOrder {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>(Comparator.naturalOrder());
        treeMap.put(1,"Vishvas");
        treeMap.put(2,"Akash");
        treeMap.put(3,"Shreya");
        treeMap.put(4,"Rupali");
        treeMap.put(5,"Mayuri");

        System.out.println(treeMap);

        TreeMap<Integer,String> reverseTreeMap = new TreeMap<>(Comparator.reverseOrder());
        reverseTreeMap.putAll(treeMap);

        System.out.println(reverseTreeMap);

    }
}
