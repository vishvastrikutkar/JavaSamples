package CoreJava.StringProblems;

public class StringRotation {

    public static void main(String[] args)
    {
        System.out.println("Strings are rotation of each other: "+verifyRotation("String","tringS"));
        System.out.println("Strings are rotation of each other: "+verifyRotation("book","okbo"));
        System.out.println("Strings are rotation of each other: "+verifyRotation("Abcde","deabc"));
        System.out.println("Strings are rotation of each other: "+verifyRotation("hello","lpeoh"));
        System.out.println("Strings are rotation of each other: "+verifyRotation("hello","brother"));
        System.out.println("Strings are rotation of each other: "+verifyRotation("","12"));
    }

    public static boolean verifyRotation(String str1, String str2)
    {
        System.out.println("String 1: "+str1);
        System.out.println("String 2: "+str2);

        if(str1.isEmpty()||str2.isEmpty())
        {
            System.out.println("One or both strings are empty.");
            return false;
        }
        if(str1.length()!=str2.length())
        {
            System.out.println("Strings are not of same length. They can't be rotation of each other");
            return false;
        }
        String concatString=str1.toLowerCase().concat(str1);
        return concatString.contains(str2);
    }
}
