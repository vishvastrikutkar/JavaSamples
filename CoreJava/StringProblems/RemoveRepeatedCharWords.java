package CoreJava.StringProblems;

public class RemoveRepeatedCharWords {

    public static void main(String[] args) {
        String inputSentence = "mmmmmyyyyy nnnnaaammme iiis vvvviiissshhhvvaas";
        StringBuilder outputSentence = new StringBuilder();
        String [] inputWords = inputSentence.split("\\s+");
        for(String word:inputWords)
        {
            outputSentence.append(removeRepeatedChar(word)).append(" ");
        }
        System.out.println(outputSentence);
    }

    public static String removeRepeatedChar(String word)
    {
        StringBuilder stringBuilder = new StringBuilder();
        Character initialChar = word.charAt(0);
        stringBuilder.append(initialChar);
        for(Character c:word.toCharArray())
        {
            if(initialChar!=c)
            {
                stringBuilder.append(c);
                initialChar=c;
            }
        }
        return stringBuilder.toString();

    }
}
