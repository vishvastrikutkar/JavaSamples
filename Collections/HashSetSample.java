package Collections;

import java.util.HashSet;
import java.util.Set;

public class
HashSetSample {

    public static  void main(String[] args)
    {
        HashSet<String> hashSet =new HashSet<>();
        hashSet.add("Vishvas");
        hashSet.add("Mayuri");
        hashSet.add("Shreya");
        hashSet.add("Shreeniket");
        hashSet.add("Testing");
        hashSet.add("Abcd");
        // Allow only one null value
        hashSet.add(null);

        System.out.println("Size of Hash set: "+hashSet.size());

        System.out.println("Hash set contains null: "+hashSet.contains(null));
        // Does not maintain order
        for(String s:hashSet)
            System.out.print(s+"\t");

        System.out.println();
        // Won't add duplicate entry
        hashSet.add("Mayuri");
        hashSet.remove("Shreeniket");

        System.out.println("Size of Hash set: "+hashSet.size());

        for(String s:hashSet)
            System.out.print(s+"\t");

        Set<String> set1 = new HashSet<>();
        set1.add("Shrirang");
        set1.add("Shrikar");
        set1.add("Vishvas");
        set1.add("Mayuri");

        set1.addAll(hashSet);

        System.out.println();
        System.out.println("After adding all elements of Hashset to set1 ");

        for(String s:set1)
            System.out.print(s+"\t");

        set1.removeAll(hashSet);

        System.out.println();
        System.out.println("After removing all elements of Hashset from set1 ");

        for(String s:set1)
            System.out.print(s+"\t");

    }
}
