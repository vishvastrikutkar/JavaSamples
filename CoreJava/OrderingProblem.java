package CoreJava;

import org.apache.log4j.Logger;

public class OrderingProblem {
    private static final Logger log = Utility.initializeLogger(OrderingProblem.class);
    public static void main(String[] args) {

        log.info(inOrder(1,2,4,false));
        log.info(inOrder(1,2,1,false));
        log.info(inOrder(1,1,2,true));
        log.info(inOrder(3,2,4,false));
        log.info(inOrder(3,2,4,true));
        log.info(inOrder(7,5,4,true));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk)
    {
        if(!bOk)
            return (b > a) && (c > b);
        else return c > b;
    }

}
