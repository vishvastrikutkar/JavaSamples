package UKG.Day3;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class WordCountOfFile {

    public static void main(String[] args)  {

        String inputFilePath = "SampleFiles\\PhoneDirectory";

        System.out.println("\nWord Count:");

        displayWordCount(readFromFile(inputFilePath));
    }

    public static HashMap<String,Integer> readFromFile(String path)
    {
        HashMap<String,Integer> wordCount = new HashMap<>();
        try (Scanner scanner=new Scanner(new File(path))) {

            while (scanner.hasNext()) {
                String word = scanner.next();
                if(!wordCount.containsKey(word)) {
                    wordCount.put(word, 1);
                }else {
                    wordCount.put(word,wordCount.get(word)+1);
                }
            }
        } catch (Exception e) {
            System.out.println("Error while processing files "+e.getMessage());
        }
        return wordCount;
    }

    public static void displayWordCount(HashMap<String,Integer> wordCount)
    {
        for (String k : wordCount.keySet()) {
            Integer v = wordCount.get(k);
            System.out.println("Word: " + k + ", Count: " + v);
        }
    }
}
