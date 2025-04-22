package CoreJava.StringProblems;

public class StringExampleImmutable {

    public static void main(String[] args) {
        String exampleString = "This is sample exampleString.";
        StringBuilder exampleStringBuilder = new StringBuilder("This is String builder String.");

        exampleString.concat("I am appending this exampleString");
        System.out.println(exampleString);

        exampleStringBuilder.append(" This is append exampleStringBuilder");
        System.out.println(exampleStringBuilder);

    }
}
