package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class PyramidDoWhileLoop {
    private static final Logger log = Utility.initializeLogger(PyramidDoWhileLoop.class);
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

        do{
            int column = 0;
             do {
                System.out.print(currentValue + "\t");
                currentValue += startingNumber; // Increment the current value by starting number
                column++; // Increment column value
             }while (column <= row);
            System.out.println();
            row++; // Increment row value
        } while (row < numberOfRows);
        // Loop for number of rows
        scanner.close();
    }


}
