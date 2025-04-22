package Java8.LambdaSamples;

import java.util.Scanner;
@FunctionalInterface
interface numberInterface
{
    void operation(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers :");
        int a = scanner.nextInt();
        int b= scanner.nextInt();

        /* Inline Lambda expression */
        numberInterface inlineLambdaObje =(x, y)->System.out.println("Addition :"+ (x+y));

        /* Lambda expression with multiple lines */
        numberInterface multiplyLogic =(p, q)-> {
            System.out.println("Value1 :"+p);
            System.out.println("Value2 :"+q);
            System.out.println("Multiplication: "+p*q);
        };
        /* Lambda expression which will only print numbers*/
        numberInterface testInterface =(x,y)->{
            System.out.println("You entered two numbers "+x +" "+y);
        };

        inlineLambdaObje.operation(a,b);
        multiplyLogic.operation(a,b);
        testInterface.operation(a,b);

        scanner.close();
    }
}
