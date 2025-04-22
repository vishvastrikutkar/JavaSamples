package CoreJava.StringProblems;
// Find the longest word in a given sentence
public class LongestWord {

    public static void main(String[] args) {
        String inputSentence = "This is my input Statement. Please find longest word";
        String longestWord = "";
        String [] words = inputSentence.replace("."," ").split(" ");
        for(String word : words)
        {
            System.out.println(word + " , "+word.length());
            if(word.length()>longestWord.length()) {
                longestWord=word;
            }
        }
        System.out.println("Longest Word = "+longestWord + "\nLength = "+longestWord.length());

    }
}
