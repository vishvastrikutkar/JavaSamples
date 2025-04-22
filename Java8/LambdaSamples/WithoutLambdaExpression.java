package Java8.LambdaSamples;

import java.util.Scanner;

interface mathInterface {
    int operation(int a, int b);
}

class adder implements mathInterface {
    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}

class subtractor implements mathInterface {
    @Override
    public int operation(int a, int b) {
        return a-b;
    }
}

public class WithoutLambdaExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        int a = scanner.nextInt();
        System.out.println("Please enter number2: ");
        int b = scanner.nextInt();

        adder objAdd = new adder();
        System.out.println("Addition Result "+objAdd.operation(a,b));

        subtractor objSub = new subtractor();
        System.out.println("Subtraction Result "+objSub.operation(a,b));
    }
}
