package CoreJava;

import org.apache.log4j.Logger;

public class BlueLottery {

    public static final Logger log = Utility.initializeLogger(BlueLottery.class);

    public static void main(String[] args) {

        log.info(blueTicket(9,1,0));
        log.info(blueTicket(9,2,0));
        log.info(blueTicket(6,1,4));
        log.info(blueTicket(15,0,5));
        log.info(blueTicket(13,2,3));
        log.info(blueTicket(5,15,5));
    }

    public static int blueTicket(int a, int b, int c) {
        if((a+b)==10||(b+c)==10||(a+c)==10)
        {
            return 10;
        }else if(((a+b)-(b+c)==10) || ((a+b)-(a+c)==10))
        {
            return 5;
        }else
        {
            return 0;
        }
    }
}
