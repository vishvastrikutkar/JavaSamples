package CoreJava;

import org.apache.log4j.Logger;

public class ShareDigitProblem {
    private static final Logger log = Utility.initializeLogger(ShareDigitProblem.class);
    public static void main(String[] args) {
        log.info(shareDigit(12,23));
        log.info(shareDigit(12,43));
        log.info(shareDigit(12,44));
        log.info(shareDigit(30,90));
        log.info(shareDigit(55,44));
    }

    public static boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10) || (a % 10 == b % 10) || (a / 10 == b % 10) || (a % 10 == b / 10);
    }



}
