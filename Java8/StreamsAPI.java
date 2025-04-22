package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Vishvas");
        arrayList.add("Mayuri");
        arrayList.add("Shreya");
        arrayList.add("Shreeniket");

        /* Without stream API
        for(String str:arrayList)
        {
            if(str.contains("S"))
                System.out.println(str);
        }*/

        /* Using Stream API Configuration -> Filtering */
        Stream<String> stream =arrayList.stream();
        List<String> stringList= stream.filter((str)-> str.contains("S")).collect(Collectors.toList());
        System.out.println(stringList);

        /* Using Stream API Configuration -> Mapping */
        List<String> stringList1 = arrayList.stream().map((str)-> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(stringList1);

        for(String name:arrayList) {
            System.out.println(name);
        }

        arrayList.forEach((element)-> System.out.print(element+"\t"));

        System.out.println();

        arrayList.forEach(System.out::println);


    }
}
