package CoreJava;

import org.apache.log4j.Logger;

public class ArrayMaxSpan {
    private static final Logger log = Utility.initializeLogger(ArrayMaxSpan.class);
    public static void main(String [] args)
    {
        log.info("Output: " + maxSpan(new int[]{1,2,1,1,3}));
        log.info("Output: " + maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        log.info("Output: " + maxSpan(new int[]{3,3,3}));
        log.info("Output: " + maxSpan(new int[]{1}));
    }

    public static int maxSpan(int[] nums) {
        int length=nums.length;
        if(length == 0)
            return 0;
        if(length == 1)
            return 1;

        int lowIndice = 0;
        int highIndice = 0;

        for (int i = 0, j=length-1; i < length && j>=0; i++, j--) {
            if(nums[0]== nums[i])
                lowIndice = i;
            if(nums[length-1] == nums[j])
                highIndice = j;
        }
        return Math.max(lowIndice +1, length-highIndice);
    }
}


