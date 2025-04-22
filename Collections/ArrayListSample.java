package Collections;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListSample {

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integersList = new ArrayList<>();
        integersList.add(10);
        integersList.add(12);

        integersList.forEach(System.out::println);

        for(int i:integersList) {
            System.out.println(i);
        }
        arrayList.addFirst("Start \t");
        for(int i=1;i<=10;i++)
        {
            arrayList.add(i,"Hello "+i+"\t");
        }
        arrayList.addLast("End \t");
        arrayList.add(2,"InsertAt 2");

        // Allows null values
        arrayList.add(null);

        for (String s : arrayList) System.out.print(s+"\t");
        System.out.println();

        List<String> oldList=new ArrayList<>();
        List<String> newList=new ArrayList<>();

        oldList.add("Vishvas");
        oldList.add("Shreya");
        oldList.add("Shreeniket");
        oldList.add("Mayuri");

        Collections.sort(oldList);

        for (String s : oldList) System.out.print(s+"\t");
        System.out.println();

        Stream<String> stream = oldList.stream();
        stream.forEach(element -> System.out.print(element+"\t"));
        

        System.out.println();
        newList.add("Vishvas");
        newList.add("Mayuri");
        newList.add("Shrirang");

        oldList.retainAll(newList);
        for (String s : oldList) System.out.print(s+"\t");
        System.out.println();

        newList = newList.subList(1,2);
        for (String s : newList) System.out.print(s+"\t");


    }

}
