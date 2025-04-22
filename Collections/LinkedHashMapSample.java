package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapSample {

    public static  void main(String[] args)
    {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Vishvas",42);
        linkedHashMap.put("Rakesh", 56);
        linkedHashMap.put("Pramod",43);

        //Ignore Duplicates
        linkedHashMap.put("Pramod",43);

        //Allows one entry of null
        linkedHashMap.put(null,47);

        // Maintains insertion order
        System.out.println("Linked Hash Map "+ linkedHashMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to get the age : ");
        String name=scanner.nextLine();

        if(linkedHashMap.containsKey(name))
            System.out.println(name +"'s Age is "+ linkedHashMap.get(name));
        else
            System.out.println("No entry with name "+name+" found in hashmap");
        System.out.println();

        System.out.println("Iterating through hashmap ");
        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet())
            System.out.println("Key "+entry.getKey() +" "+"Value "+entry.getValue());

        System.out.println();
        linkedHashMap.remove("Pramod");
        System.out.println("After removing Pramod "+ linkedHashMap);
    }
}
