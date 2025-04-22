package CoreJava;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class HT_Basics {
    public static final Logger log = Utility.initializeLogger(HT_Basics.class);
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        log.info("Please enter your name: ");
        String userInput=scanner.nextLine();
        log.info("Hello "+userInput);
        scanner.close();
    }
}
