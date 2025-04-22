package CoreJava.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class RegExpression {
        public static void main(String[] args) {
            testRegex("\\d", "abc 123 def");          // Digits
            testRegex("\\D", "abc 123 def");         // Non-digit
            testRegex("\\w", "hello_123!@#");       // Word characters
            testRegex("\\W", "hello_123!@#");       // Non-word characters
            testRegex("\\s", "Hello World!");       // Whitespace
            testRegex("\\S", "Hello World!");       // Non-whitespace
            testRegex("^Hello", "Hello world!");   // Start of string
            testRegex("world$", "Hello world");    // End of string
            testRegex("a.c", "abc aac axc azc abbc");   // Any character between 'a' and 'c'
            testRegex(".*", "Hello 123!");         // Any characters (zero or more)
            testRegex("[abc]", "cat bat rat");     // 'a', 'b', or 'c'
            testRegex("[a-z]", "A b c d E");       // Lowercase letters
            testRegex("[0-9]{3}", "abc 123 4567"); // Exactly 3 digits
            testRegex("(abc|xyz)", "abc 123 xyz"); // Either 'abc' or 'xyz'
        }

        public static void testRegex(String regex, String text) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Regex: " + regex);
            System.out.println("Text: " + text);

            while (matcher.find()) {
                System.out.println("Match found: " + matcher.group());
            }
            System.out.println("------------------------");
        }
    }
