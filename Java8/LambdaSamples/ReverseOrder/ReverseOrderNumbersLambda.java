package Java8.LambdaSamples.ReverseOrder;

import java.util.Arrays;
import java.util.List;

public class ReverseOrderNumbersLambda {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(10,22,3,8,32,67);

        listOfNumbers.sort((n1, n2) -> n2.compareTo(n1));

        /*listOfNumbers.sort((n1,n2)->{
            if(n1<n2)
            {
                return +100;
            }else if(n1>n2)
            {
                return -100;
            }else {
                return 0;
            }
        });*/

        System.out.println(listOfNumbers);
    }
}
