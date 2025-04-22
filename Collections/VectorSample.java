package Collections;

import java.util.Vector;

public class VectorSample {

    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<>();
        vector.addFirst("Start \t");
        for(int i=1;i<=10;i++)
        {
            vector.add(i,"Hello "+i+"\t");
        }
        vector.addLast("End \t");
        vector.add(6,"InsertAt 2");
        vector.addLast("End Now \t");

        //Allows null values
        vector.add(null);

        for (String s : vector) System.out.println(s);
    }
}
