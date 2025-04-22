package Java8;

import java.util.function.*;

public class UnaryOperatorPractice {

    public static void main(String[] args) {

        // Function FI takes Integer and returns Integer
        Function<Integer,Integer> function =(i)->{
            return i*i;
        };
        System.out.println(function.apply(100));

        // Unary Operator : Used when input and output type is same.
        UnaryOperator<Integer> unaryOperator =(i)->{
            return i*i;
        };

        System.out.println(unaryOperator.apply(100));

        // This will take Integer input and returns Integer
        IntUnaryOperator intUnaryOperator1=(i)->i*i;
        System.out.println(intUnaryOperator1.applyAsInt(100));

        // This will take Integer input and returns Integer
        IntUnaryOperator intUnaryOperator2=(i)->i+i;
        System.out.println(intUnaryOperator2.applyAsInt(100));

        // This will take Long input and returns Long
        LongUnaryOperator longUnaryOperator=(i)->i*i;
        System.out.println(longUnaryOperator.applyAsLong(100));

        // This will take double input and returns double
        DoubleUnaryOperator doubleUnaryOperator=(i)->i*i;
        System.out.println(doubleUnaryOperator.applyAsDouble(100));

        // Chaining: It will call intUnaryOperator1 and then on that result it will call intUnaryOperator2
        System.out.println(intUnaryOperator1.andThen(intUnaryOperator2).applyAsInt(10));

        // Chaining: It will call intUnaryOperator2 and then on that result it will call intUnaryOperator1
        System.out.println(intUnaryOperator1.compose(intUnaryOperator2).applyAsInt(10));

    }

}
