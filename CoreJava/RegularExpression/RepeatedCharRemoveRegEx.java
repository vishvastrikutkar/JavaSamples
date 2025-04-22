package CoreJava.RegularExpression;

public class RepeatedCharRemoveRegEx {
    public static void main(String[] args) {
        String inputString ="aaaaaabbbbbbccccdeeee ggg gg ttt e rrr";
        String outputString = inputString.replaceAll("(.)\\1+","$1");
        System.out.println(outputString);
    }
}
