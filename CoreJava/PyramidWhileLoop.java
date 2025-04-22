package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class PyramidWhileLoop {
    private static final Logger log = Utility.initializeLogger(PyramidWhileLoop.class);
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter Number of Rows in pyramid :");
        int numberOfRows=scanner.nextInt();

        log.info("Enter Starting number :");
        int startingNumber=scanner.nextInt();
        System.out.println();

        // Keep track of current value
        int currentValue = 0;
        int row = 0;

        // Loop for number of rows
        while (row < numberOfRows) {
            int column = 0;
            while (column <= row) {
                System.out.print(currentValue + "\t");
                currentValue += startingNumber; // Increment the current value by starting number
                column++; // Increment column value
            }
            System.out.println();
            row++; // Increment row value
        }

        scanner.close();
    }

}
