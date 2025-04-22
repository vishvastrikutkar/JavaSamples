package CoreJava.StringProblems;

public class RemoveCharFromString {

    public static void main(String[] args) {
        String str = "This is input string";
        System.out.println(removeCharUsingRegEx(str, 'i'));
        removeChar(str,'i');
    }

    public static String removeCharUsingRegEx(String str, char ch) {
        return str.replaceAll(String.valueOf(ch),"");
    }

    public static void removeChar(String str,char ch)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=ch) {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
