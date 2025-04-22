package Java8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReverseOrderLambda {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(8);
        treeSet.add(95);
        treeSet.add(45);
        treeSet.add(89);
        treeSet.add(23);

        System.out.println(treeSet);

        Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);

        TreeSet<Integer> reverseOrderSet = new TreeSet<>(comparator);
        reverseOrderSet.addAll(treeSet);

        System.out.println(reverseOrderSet);

    }
}
