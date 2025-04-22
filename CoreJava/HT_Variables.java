package CoreJava;

import org.apache.log4j.Logger;

public class HT_Variables {
    public static final Logger log = Utility.initializeLogger(HT_Variables.class);
    public static void main(String[] args)
    {
        int danielApples,amberApples;
        danielApples=3;
        amberApples=2;
        int totalApples=danielApples+amberApples;
        log.info("Daniel has "+danielApples+" apples");
        log.info("Amber has "+amberApples+" apples");
        log.info("Daniel and Amber have "+totalApples+" apples");

        double danielApplesDecimal = 3.5;
        double amberApplesDecimal=2.5;
        double totalApplesDecimal;

        totalApplesDecimal=danielApplesDecimal+amberApplesDecimal;

        log.info("Daniel has "+danielApplesDecimal+" apples");
        log.info("Amber has "+amberApplesDecimal+" apples");
        log.info("Daniel and Amber have "+totalApplesDecimal+" apples");

    }
}
