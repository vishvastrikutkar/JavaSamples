package Java8.Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordStream {

    public static void main(String[] args) {
        String input = "This is new string";

        String output = Stream.of(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(input);
        System.out.println(output);

        String[] words = input.split(" ");
        for(String word:words) {
            System.out.print(new StringBuilder(word).reverse()+" ");
        }

    }

}
