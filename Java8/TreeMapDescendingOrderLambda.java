package Java8;

import java.util.TreeMap;

public class TreeMapDescendingOrderLambda {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>((k1,k2)->k1 .compareTo(k2));
        treeMap.put(1,"Vishvas");
        treeMap.put(2,"Akash");
        treeMap.put(3,"Shreya");
        treeMap.put(4,"Rupali");
        treeMap.put(5,"Mayuri");

        System.out.println(treeMap);

        TreeMap<Integer,String> reverseTreeMap = new TreeMap<>((k1,k2)->k2.compareTo(k1));
        reverseTreeMap.putAll(treeMap);

        System.out.println(reverseTreeMap);

    }
}
