package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapSample {

    public static  void main(String[] args)
    {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Vishvas",42);
        hashMap.put("Rakesh", 56);
        hashMap.put("Pramod",43);

        //Ignore Duplicates
        hashMap.put("Pramod",43);

        //Allows one entry of null
        hashMap.put(null,45);

        hashMap.put("Testnull",null);

        // Doesn't Maintain insertion order
        System.out.println("Hashmap "+hashMap);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to get the age : ");
        String name=scanner.nextLine();

        if(hashMap.containsKey(name))
            System.out.println(name +"'s Age is "+hashMap.get(name));
        else
            System.out.println("No entry with name "+name+" found in hashmap");
        System.out.println();

        System.out.println("Iterating through hashmap ");
        for(Map.Entry<String,Integer> entry:hashMap.entrySet())
            System.out.println("Key "+entry.getKey() +" "+"Value "+entry.getValue());

        System.out.println();
        hashMap.remove("Pramod");
        System.out.println("After removing Pramod "+hashMap);

        for(String key:hashMap.keySet())
            System.out.println("Key "+key +" "+"Value "+hashMap.get(key));
    }
}
