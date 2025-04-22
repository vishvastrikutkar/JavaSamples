package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetSample {

    public static  void main(String[] args)
    {
        LinkedHashSet<String> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add("Vishvas");
        linkedHashSet.add("Mayuri");
        linkedHashSet.add("Shreya");
        linkedHashSet.add("Shreeniket");
        linkedHashSet.add("Testing");
        linkedHashSet.add("Abce");
        linkedHashSet.add(null);

        System.out.println("Size of Hash set: "+linkedHashSet.size());

        // Does maintain order
        for(String s: linkedHashSet)
            System.out.print(s+"\t");

        System.out.println();

        // Won't add duplicate entry
        linkedHashSet.add(null);
        linkedHashSet.add("Mayuri");

        linkedHashSet.addLast("End");
        linkedHashSet.addFirst("Start");

        linkedHashSet.remove("Shreya");

        for(String s: linkedHashSet)
            System.out.print(s+"\t");

        System.out.println();
        System.out.println("Size of Hash set: "+linkedHashSet.size());

    }
}
