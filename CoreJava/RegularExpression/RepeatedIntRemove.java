package CoreJava.RegularExpression;

public class RepeatedIntRemove {
    public static void main(String[] args) {
        int input = 111223343;
        int output = Integer.parseInt(String.valueOf(input).replaceAll("(\\d)\\1+","$1"));
        System.out.println(output);
    }
}
