package Java8.LambdaSamples.PalimdromString;

import Java8.iPalindromicString;

public class PalindromicStringLambda {
    public static void main(String[] args) {

        String string1 = "A man, a plan, a canal, Panama";
        String string2 = "Race a ecaR";
        String string3 = "Madam";
        String string4 = "Trace a ecaTe";

        // Lambda Expression
        iPalindromicString i = (String s) -> {
            String str = s.toLowerCase().replaceAll("[^a-zA-z0-9]","");
            return new StringBuilder(str).reverse().toString().equals(str);
        };

        System.out.println(i.verifyStringPalindromic(string1));
        System.out.println(i.verifyStringPalindromic(string2));
        System.out.println(i.verifyStringPalindromic(string3));
        System.out.println(i.verifyStringPalindromic(string4));
    }

}





