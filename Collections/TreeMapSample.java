package Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSample {

    public static  void main(String[] args)
    {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Vishvas",42);
        treeMap.put("Rakesh", 56);
        treeMap.put("Pramod",43);
        treeMap.put("Ajay",32);
        treeMap.put("Zecko",78);

        //Ignore Duplicates
        treeMap.put("Pramod",43);

        // Does not allow null values
        //treeMap.put(null,67);

        // By-default maintain ascending order
        System.out.println("TreeMap "+ treeMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to get the age : ");
        String name=scanner.nextLine();

        if(treeMap.containsKey(name))
            System.out.println(name +"'s Age is "+ treeMap.get(name));
        else
            System.out.println("No entry with name "+name+" found in hashmap");
        System.out.println();

        System.out.println("Iterating through hashmap ");
        for(Map.Entry<String,Integer> entry: treeMap.entrySet())
            System.out.println("Key "+entry.getKey() +" "+"Value "+entry.getValue());

        System.out.println();
        treeMap.remove("Pramod");
        System.out.println("After removing Pramod "+ treeMap);

        // Not allowed. Will throw null pointer exception at run time.
        //treeMap.put(null,12);

    }
}
