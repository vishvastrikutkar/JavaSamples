package Java8.LambdaSamples.StringRotation;

public class StringRotationLambda {

    public static void main(String[] args) {

        iStringRotation iStringRotation = (str1,str2)->(str1.toLowerCase().concat(str1)).contains(str2);

        System.out.println(iStringRotation.verifyStringRotation("hello","elloh"));
        System.out.println(iStringRotation.verifyStringRotation("hello","illoh"));
    }
}
