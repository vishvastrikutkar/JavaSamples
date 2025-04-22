package CoreJava;

import org.apache.log4j.Logger;

public class SumLimitProblem {
    private static final Logger log = Utility.initializeLogger(ShareDigitProblem.class);

    public static void main(String[] args) {
        log.info(sumLimit(2,3));
        log.info(sumLimit(8,3));
        log.info(sumLimit(8,1));
        log.info(sumLimit(123,1));
        log.info(sumLimit(9000,1000));
    }
    public static int sumLimit(int a, int b) {
        int sum=a+b;
        int lenOfA=String.valueOf(a).length();
        int lenOfSum=String.valueOf(sum).length();
        if(lenOfA==lenOfSum)
        {
            return sum;
        }else if(lenOfSum>lenOfA)
        {
            return a;
        }
        return b;
    }
}
