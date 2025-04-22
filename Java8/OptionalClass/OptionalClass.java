package Java8.OptionalClass;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("88");
        System.out.println(optional.get());

        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());

        optional=Optional.ofNullable(null);

        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());

        testing("88");
        testing(null);
    }

    public static void testing(String str)
    {
        /* This is the older way of checking null
        if(str!=null){
            System.out.println(str);
        }else {
            throw new NullPointerException();
        }*/

        Optional<String> optionalString = Optional.ofNullable(str);
        if(optionalString.isPresent()){
            System.out.println(optionalString.get());
        }else {
            System.out.println("String is empty");
        }

    }

}
