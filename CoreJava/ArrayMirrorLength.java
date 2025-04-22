package CoreJava;

import org.apache.log4j.Logger;

public class ArrayMirrorLength {
    private static final Logger log = Utility.initializeLogger(ArrayMirrorLength.class);
    public static void main(String[] args) {
        log.info("Output: " + maxMirrorLengthOfArray(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        log.info("Output: " + maxMirrorLengthOfArray(new int[]{1, 2, 1}));
        log.info("Output: " + maxMirrorLengthOfArray(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        log.info("Output: " + maxMirrorLengthOfArray(new int[]{}));
        log.info("Output: " + maxMirrorLengthOfArray(new int[]{1,2,3,4}));
    }

    public static int maxMirrorLengthOfArray(int[] nums) {
        int maxMirrorLength =0;

        if(nums.length==0)
        {
            return maxMirrorLength;
        }

        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                int currMirrorLength =0;
                int a=i;
                int b=j;

                while (a<nums.length && b>=0 && nums[a]==nums[b])
                {
                    currMirrorLength++;
                    a++;
                    b--;
                }
                if(currMirrorLength > maxMirrorLength)
                {
                    maxMirrorLength = currMirrorLength;
                }
            }
        }

        return maxMirrorLength;
    }
}
