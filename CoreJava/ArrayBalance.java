package CoreJava;

import org.apache.log4j.Logger;

public class ArrayBalance {
    private static final Logger log = Utility.initializeLogger(ArrayBalance.class);
    public static void main(String[] args)
    {
        log.info("Output: " + canBalance(new int[]{1,2,1,1,3}));
        log.info("Output: " + canBalance(new int[]{1, 4, 2, 1, 4, 1, 4}));
        log.info("Output: " + canBalance(new int[]{2, 3, 4, 1, 2}));
        log.info("Output: " + canBalance(new int[]{10,10}));
        log.info("Output: " + canBalance(new int[]{2, 1, 1, 1, 4}));
    }
    public static boolean canBalance(int[] nums) {
        // Get sum of all elements of array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Initialize the left running sum
        int leftSum = 0;

        // Iterate through the array to find the split point
        for (int num : nums) {
            // Update the left running sum
            leftSum += num;

            // Calculate the right running sum
            int rightSum = totalSum - leftSum;

            // Check if the left and right sums are equal
            if (leftSum == rightSum) {
                return true;
            }
        }

        // If no split point is found, return false
        return false;
    }
}


