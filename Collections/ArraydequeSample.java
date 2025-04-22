package Collections;

import java.util.*;

public class ArraydequeSample {

    public static void main(String[] args)
    {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Vishvas");
        arrayDeque.add("Mayuri");
        arrayDeque.add("Shreya");
        arrayDeque.add("Shreeniket");
        arrayDeque.addLast("Shrirang");
        arrayDeque.addFirst("Ratnakarrao");

        for (String string : arrayDeque)
            System.out.println(string);

        System.out.println("Head of the Queue: " + arrayDeque.element());

        arrayDeque.add("Padmaja");
        arrayDeque.remove();
        System.out.println("Head of the Queue: " + arrayDeque.element());

        arrayDeque.poll();
        System.out.println("Head of the Queue: " + arrayDeque.element());

        // Run time exception
        //arrayDeque.add(null);

        for(String s:arrayDeque)
            System.out.println(s);
    }

}
