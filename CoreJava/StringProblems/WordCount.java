package CoreJava.StringProblems;

import java.util.*;

public class WordCount {
/*
 We need to take a sentence as input and then output will be word followed by its recurrence count in the sentence

 Input: "This is sample String. This is only sample."
 Output:
    This: 2
    is: 2
    sample: 1
    String.: 1
    only: 1
    sample.: 1
 */
    public static void main(String[] args) {

        String inputString = "This is sample String. This is only sample.";
        System.out.println("Input String :"+inputString);
        List<String> listOfWords = Arrays.stream(inputString.split(" ")).toList();
        LinkedHashMap<String,Integer> wordCountMap = new LinkedHashMap<>();
        for(String word:listOfWords) {
            if(!wordCountMap.containsKey(word)) {
                wordCountMap.put(word,1);
            }else{
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }
        }
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() +"  "+entry.getValue());
        }
    }
}
