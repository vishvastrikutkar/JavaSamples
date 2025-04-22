package Java8.Compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderNumbers {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(10,22,3,8,32,67);

        Comparator<Integer> comparator = new Comparator<>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        listOfNumbers.sort(comparator);

        System.out.println(listOfNumbers);
    }
}
