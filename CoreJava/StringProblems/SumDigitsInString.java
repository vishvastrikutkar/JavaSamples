package CoreJava.StringProblems;

import org.apache.log4j.Logger;

public class SumDigitsInString {

    private static final Logger log = Logger.getLogger(SumDigitsInString.class);

    public static void main(String[] args) {
        log.info(sumNumbers("Chocolate"));
        log.info(sumNumbers(""));
        log.info(sumNumbers("7 11"));
        log.info(sumNumbers("abc22deg44 77_dgt_123"));
        log.info(sumNumbers("5$$1;;1!!"));
    }
    public static int sumNumbers(String str) {
        int sum=0;

        StringBuilder digitString = new StringBuilder();
        for(char c:str.toCharArray())
        {
            if(Character.isDigit(c))
                digitString.append(c);
            else
            {
                if(!digitString.isEmpty())
                {
                    sum=sum+Integer.parseInt(digitString.toString());
                    digitString.setLength(0);
                }
            }
        }
        if(!digitString.isEmpty())
        {
            sum=sum+Integer.parseInt(digitString.toString());
        }

        return sum;
    }

}
