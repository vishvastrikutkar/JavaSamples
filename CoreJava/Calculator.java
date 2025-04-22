package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    public static final Logger log = Utility.initializeLogger(Calculator.class);
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);

            while (true)
            {
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Reminder");
                System.out.println("6. Percentage (%)");
                System.out.println("7. Exit");
                System.out.println("-----------------------");
                System.out.println("Please Enter your choice");
                try
                {
                int choice = scanner.nextInt();
                if (choice > 7) {
                    log.info("Choice Entered "+choice);
                    log.error("Invalid choice. Please enter correct choice");
                    continue;
                }
                switch (choice) {
                    case 1:
                        log.info("Enter first numbers");
                        num1 = scanner.nextDouble();
                        log.info("Enter second numbers");
                        num2 = scanner.nextDouble();
                        double sum=num1+num2;
                        System.out.printf("The sum of %.2f and %.2f is: %.2f%n", num1, num2, sum);
                        log.info("Addition :"+sum);
                        break;
                    case 2:
                        System.out.println("Enter first numbers");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second numbers");
                        num2 = scanner.nextDouble();
                        System.out.printf("The subtraction of %.2f and %.2f is: %.2f%n", num1, num2, num1 - num2);
                        break;
                    case 3:
                        System.out.println("Enter first numbers");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second numbers");
                        num2 = scanner.nextDouble();
                        System.out.printf("The multiplication of %.2f and %.2f is: %.2f%n", num1, num2, num1 * num2);
                        break;
                    case 4:
                        System.out.println("Enter first numbers");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second numbers");
                        num2 = scanner.nextDouble();
                        if (num2 != 0) {
                            System.out.printf("The division of %.2f and %.2f is: %.2f%n", num1, num2, num1 / num2);
                        } else {
                            log.error("Error: Division by Zero not allowed.");
                        }
                        break;
                    case 5:
                        System.out.println("Enter first numbers");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second numbers");
                        num2 = scanner.nextDouble();
                        System.out.printf("The reminder of %.2f and %.2f is: %.2f%n", num1, num2, num1 % num2);
                        break;
                    case 6:
                        System.out.println("Enter first numbers");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second numbers");
                        num2 = scanner.nextDouble();
                        System.out.printf("The %.2f 6is %.2f percent of %.2f%n ", num1, (num1 / num2)*100,num2);
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice ! Please enter correct choice.");
                }
            }catch (Exception e) {
                    log.error("Invalid input format ! Please enter correct choice.");
                    scanner.nextLine();
                }
        }

    }
}




