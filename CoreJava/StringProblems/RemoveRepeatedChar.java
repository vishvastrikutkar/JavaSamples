package CoreJava.StringProblems;

/**
 * Removing repeated Char from given string
 * Input : aaaaabbbbbaaaggg  $$$$%%%%S****
 * Output : ab$%S*
 */
public class RemoveRepeatedChar {

    public static void main(String[] args) {
        String inputString = "aaaaabbbbbaaaggg   $$$$%%%%S**   **";
        char charToCompare = inputString.charAt(0);
        StringBuilder outputString = new StringBuilder().append(charToCompare);

        for(Character c:inputString.toCharArray())
        {
            if(charToCompare!=c)
            {
                outputString.append(c);
                charToCompare=c;
            }
        }
        System.out.println("Input : "+inputString);
        System.out.println("Output : "+outputString);
    }
}
