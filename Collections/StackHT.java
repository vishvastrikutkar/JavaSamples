package Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

public class StackHT {

    public static void main(String[] args) throws IOException {

        // Set File Path
        String filePath="SampleFiles\\MatchingInputFile";

        // Read all lines and store in List of strings
        List<String> lines= Files.readAllLines(Paths.get(filePath));
        for(String string:lines) {
            System.out.println(isMatchingBrackets(string));
        }
    }

    /***
     *
     * @param string : Input string which will be verified for matching brackets.
     * @return : True or False depending on the matching bracket in the string.
     */
    public static boolean isMatchingBrackets(String string)
    {
        Stack<Character> stack = new Stack<>();
        boolean returnValue =false;
        char[] chars = string.toCharArray();

        for(char c:chars)
        {
            if(c=='('|| c=='{'|| c=='[')
                stack.push(c);
            else if(c==')'|| c=='}'|| c==']')
                returnValue = !stack.empty() && isBracketMatching(stack.pop(), c);
        }
        return stack.isEmpty() && returnValue;
    }

    /***
     * Verify if given two chars are open and close brackets.
     * @param x : Opening brackets char
     * @param y : Closing brackets char
     * @return : True or False.
     */
    public static boolean isBracketMatching(char x, char y)
    {
        return ((x=='(')&&(y==')')) ||
                ((x=='{')&&(y=='}')) ||
                ((x=='[')&&(y==']'));
    }
}
