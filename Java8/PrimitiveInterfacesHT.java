package Java8;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PrimitiveInterfacesHT {
    public static void main(String[] args) {

        IntPredicate integerIntPredicate =(number)->{
            boolean isPrime=true;
            if(number<=1)
                isPrime=false;
            else {
                for(int i=2;i<=number/2;i++)
                {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            return isPrime;
        };

        IntConsumer intConsumer = (number)-> System.out.println("Square of the number "+number+" is "+number*number);

        IntSupplier intSupplier = () ->{
            Random random = new Random();
            return random.nextInt(1,5000);
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = scanner.nextInt();
        System.out.println("Number "+number+" is prime ? "+ integerIntPredicate.test(number));
        intConsumer.accept(number);

        System.out.println("Random Number "+intSupplier.getAsInt());
    }
}
