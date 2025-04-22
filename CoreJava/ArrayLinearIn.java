package CoreJava;

import org.apache.log4j.Logger;

public class ArrayLinearIn {
    private static final Logger log = Utility.initializeLogger(ArrayLinearIn.class);
    public static void main(String[] args) {
        log.info("Output: " + linearIn(new int[]{1, 2, 3, 8, 9, 3, 2, 1},new int[]{2,3}));
        log.info("Output: " + linearIn(new int[]{1, 2, 4, 6},new int[]{2,3,4}));
        log.info("Output: " + linearIn(new int[]{2, 2, 4, 4, 6, 6},new int[]{2,4}));
    }

    public static boolean linearIn(int[] outer,int[] inner) {

        int outerIndex = 0;
        int innerIndex = 0;

        // Iterate through both arrays
        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] < inner[innerIndex]) {
                outerIndex++;
            } else if (outer[outerIndex] == inner[innerIndex]) {
                outerIndex++;
                innerIndex++;
            } else {
                return false;
            }
        }
        return innerIndex == inner.length;
        }
}
