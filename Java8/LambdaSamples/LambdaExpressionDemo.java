package Java8.LambdaSamples;

import java.util.ArrayList;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(39);
        arrayList.add(44);
        // Lambda Expression to print all numbers of the array.
        arrayList.forEach(n->System.out.println(n));

        // Lambda Expression to print only even numbers from the array
        arrayList.forEach(n->{
            if(n%2==0)
            {
                System.out.println(n);
            }
        });
    }
}
