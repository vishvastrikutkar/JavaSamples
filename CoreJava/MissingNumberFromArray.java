package CoreJava;

import org.apache.log4j.Logger;

public class MissingNumberFromArray {
    private static final Logger log = Utility.initializeLogger(MissingNumberFromArray.class);
    public static void main(String[] args)
    {
        int[] numArray=new int[100];
        int missingNumber=46;
        for(int i=0,j=1;i<numArray.length-1;i++,j++)
        {
            if(j==missingNumber)
                j++;
            numArray[i]=j;
        }
        for(int i=0;i<numArray.length-1;i++) {
            if(i!=0 && i%10==0)
            {
                System.out.println();
            }
            System.out.print(numArray[i] + "\t");
        }
        System.out.println();

        log.info("Missing Number is "+missingNumber(numArray));
        log.info("Missing Number is "+missingNumberXOR(numArray));
    }

    public static int missingNumber(int[] numberArray)
    {
        int expectedSum=100*(100+1)/2;
        System.out.println("Expected Sum:"+expectedSum);

        int actualSum=0;
        for(int i:numberArray)
            actualSum+=i;
        System.out.println("Actual Sum:"+actualSum);

        return expectedSum-actualSum;
    }

    public static int missingNumberXOR(int[] numberArray)
    {
        int xorActual=0;
        int xorExpectedSum=0;

        for(int i=1;i<=100;i++)
            xorExpectedSum^=i;
        System.out.println("XOR Expected :"+xorExpectedSum);

        for(int i:numberArray)
            xorActual^=i;
        System.out.println("XOR Actual :"+xorActual);

        return xorExpectedSum^xorActual;
    }
}
