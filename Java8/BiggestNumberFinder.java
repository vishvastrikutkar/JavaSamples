package Java8;

public class BiggestNumberFinder {

    public static void main(String[] args) {
        int[] numbers = {10,1,30,44,38,35};

        int max=0;
        int secondMax =0;

        for(int n:numbers)
        {
            if(n>max)
            {
                secondMax=max;
                max=n;
            }else if(n>secondMax && n!=max){
                secondMax=n;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);

    }


}
