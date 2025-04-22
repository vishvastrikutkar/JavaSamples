package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class PyramidForLoop {
    private static final Logger log = Utility.initializeLogger(PyramidForLoop.class);
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter Number of Rows in pyramid :");
        int numberOfRows=scanner.nextInt();

        log.info("Enter starting Number :");
        int startingNumber=scanner.nextInt();
        System.out.println();

        // Keep track of current value
        int currentValue=0;

        for(int i=0;i<numberOfRows;i++)
        {
            for (int j = 0; j <= i; j++) {
                    System.out.print(currentValue + "\t");
                    currentValue+=startingNumber;
                }
            System.out.println();
        }
        scanner.close();
    }
}
