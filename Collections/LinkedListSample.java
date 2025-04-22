package Collections;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First");
        for(int i=1;i<=10;i++)
        {
            linkedList.add(i,"Hello"+i+"\t");
        }
        linkedList.addLast("End");
        //Allows null values
        linkedList.add("Hello");
        linkedList.add(null);

        for (String s : linkedList)
            System.out.print(s+"\t");

        System.out.println();
        linkedList.remove(2);
        linkedList.remove();

        for (String s : linkedList)
            System.out.print(s+"\t");


    }

}
