package Java8.LambdaSamples.SecondBigNumberFinder;


public class BiggestNumberFinderLambda {

    public static void main(String[] args) {
        int[] numbers = {10,1,30,44,38,35};

        iSecondMaxNumberFinder i=(inputN)-> {
            int max=0;
            int secondMax =0;

            for(int n:inputN)
            {
                if(n>max)
                {
                    secondMax=max;
                    max=n;
                }else if(n>secondMax && n!=max){
                    secondMax=n;
                }
            }
            return secondMax;
        };

        System.out.println(i.getSecondBiggestNumber(numbers));

    }
}




