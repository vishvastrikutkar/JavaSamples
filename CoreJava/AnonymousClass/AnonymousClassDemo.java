package CoreJava.AnonymousClass;

import java.util.Scanner;

interface MathInterface {
    int operation(int a, int b);
}



public class AnonymousClassDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number1: ");
        int a = scanner.nextInt();
        System.out.println("Please enter number2: ");
        int b = scanner.nextInt();

        // Anonymous Inner class for AddInterface
        MathInterface addObj = new MathInterface() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        //MathInterface subObj1 = (a1, b1) -> a1 + b1;

        // Anonymous Inner class for SubInterface
        MathInterface subObj = new MathInterface() {
            @Override
            public int operation(int a, int b) {
                return a-b;
            }
        };
         //MathInterface subObj1 = (a1, b1) -> a1 - b1;

        System.out.println("Addition Result " + addObj.operation(a, b));
        System.out.println("Subtraction Result " + subObj.operation(a, b));

        scanner.close();
    }
}
