package CoreJava;

import org.apache.log4j.Logger;

public class ArrayClump {
    private static final Logger log = Utility.initializeLogger(ArrayClump.class);
    public static void main(String[] args) {
        log.info("Output: " + clumpCount(new int[]{1, 2, 2, 3, 4, 4}));
        log.info("Output: " + clumpCount(new int[]{1, 4, 2, 1, 4, 1, 4}));
        log.info("Output: " + clumpCount(new int[]{1, 1, 2, 1, 1}));
        log.info("Output: " + clumpCount(new int[]{10, 10, 10, 10, 10}));
        log.info("Output: " + clumpCount(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
    }

    public static int clumpCount(int[] nums) {
        int count=0;
        boolean currentClump=false;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                if(!currentClump)
                {
                    count++;
                    currentClump=true;
                }
            }else
            {
                currentClump=false;
            }
        }
        return count;
    }
}
