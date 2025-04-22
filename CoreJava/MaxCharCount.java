package CoreJava;


import org.apache.log4j.Logger;

public class MaxCharCount {
    public static final Logger log = Utility.initializeLogger(MaxCharCount.class);
    public static void main(String[] args) {

        log.info(maxCharCount("hoopla"));
        log.info(maxCharCount("hoopla"));
        log.info(maxCharCount("abbCCCddBBBxx"));
        log.info(maxCharCount("xyzz"));
        log.info(maxCharCount("XX2222BBBbbXX2222"));
        log.info(maxCharCount("XXBBBbbxx"));

    }
    public static int maxCharCount(String str) {
        // Check if string is empty, return 0
        if(str.isEmpty()) {
            log.info("Given string is empty");
            return 0;
        }

        int maxCount=1;
        int currCount=1;

        for(int i=1;i<str.length();i++)
        {
            // Verify next and previous chars are same in string. Increment current count in this case
            if(str.charAt(i)==str.charAt(i-1))
                currCount++;
            else
            {
                // If two consecutive char are not same, then check if the current count is higher than max count
                if (currCount > maxCount)
                    maxCount = currCount;
                // Reset Current count as char are different.
                currCount=1;
            }
        }
        if(currCount>maxCount)
            maxCount=currCount;

        return maxCount;
    }
}
