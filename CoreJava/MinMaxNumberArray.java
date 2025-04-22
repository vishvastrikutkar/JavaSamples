package CoreJava;

import org.apache.log4j.Logger;

public class MinMaxNumberArray {
    private static final Logger log = Utility.initializeLogger(ArrayMirrorLength.class);
    public static void main(String[] args)
    {
        int[] numArray={13,4,10,55,12,40};

        for (int j : numArray) {
            System.out.print(j + "\t");
        }
        int minNumber=numArray[0];
        int maxNumber=numArray[0];
        for (int i=0;i<numArray.length-1;i++)
        {
            if(numArray[i]<minNumber)
                minNumber = numArray[i];
            if(numArray[i]>maxNumber)
                maxNumber=numArray[i];
        }
        System.out.println();
        log.info("Smallest number: " + minNumber);
        log.info("Largest number: " + maxNumber);
    }


}
