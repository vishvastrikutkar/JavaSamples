package Java8.OptionalClass;

import java.util.Optional;

public class OptionalClassSample {
    public static void main(String[] args) {
        String [] words = new String[10];
        Optional<String> checknull = Optional.ofNullable(words[4]);
        if(checknull.isPresent())
               System.out.println(words[4]);
        else
            System.out.println("Word is null");

        words[2]="This is new string";
        Optional<String> optional=  Optional.of(words[2]);
        System.out.println(optional.get());

    }
}
