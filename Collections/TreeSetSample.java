package Collections;

import java.util.TreeSet;

public class TreeSetSample {

    public static  void main(String[] args)
    {
        TreeSet<String> treeSet =new TreeSet<>();
        treeSet.add("Vishvas");
        treeSet.add("Mayuri");
        treeSet.add("Shreya");
        treeSet.add("Shreeniket");
        treeSet.add("Testing");
        treeSet.add("Abce");
        //treeSet.add(null);

        // Won't add duplicate entry
        treeSet.add("Mayuri");

        // Doesn't allow null values to add
        //treeSet.add(null);

        // By default sorted in ascending order
        for(String s: treeSet)
            System.out.print(s+"\t");

        System.out.println();

        treeSet.remove("Testing");

        for(String s: treeSet)
            System.out.print(s+"\t");
    }
}
