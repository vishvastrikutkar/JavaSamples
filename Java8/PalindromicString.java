package Java8;

import Java8.iPalindromicString;

class TestString implements iPalindromicString {

    @Override
    public boolean verifyStringPalindromic(String s) {
        String str =s.toLowerCase().replaceAll("[^a-zA-z0-9]","");
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}

public class PalindromicString {
    public static void main(String[] args) {

        String string1 = "A man, a plan, a canal, Panama";
        String string2 = "Race a ecaR";
        String string3 = "Madam";
        String string4 = "Trace a ecaTe";

        // Without Lambda expression, WE need class which implements interface then we need to create an
        // Object of that class to call the method.
        System.out.println("Without Lambda Expression :");
        TestString testString = new TestString();

        System.out.println(testString.verifyStringPalindromic(string1));
        System.out.println(testString.verifyStringPalindromic(string2));
        System.out.println(testString.verifyStringPalindromic(string3));
        System.out.println(testString.verifyStringPalindromic(string4));

    }
}


