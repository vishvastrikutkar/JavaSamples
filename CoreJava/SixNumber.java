package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class SixNumber {
    private static final Logger log = Utility.initializeLogger(ShareDigitProblem.class);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter First number :");
        int firstNumber = scanner.nextInt();

        log.info("Enter second number");
        int secondNumber = scanner.nextInt();
        log.info(verifyNumber(firstNumber,secondNumber));

    }

    public static boolean verifyNumber(int n1, int n2) {
        if (n1 == 6 || n2 == 6) {
            return true;
        } else return (n1 + n2) == 6 || Math.abs(n1 - n2) == 6;
    }
}
