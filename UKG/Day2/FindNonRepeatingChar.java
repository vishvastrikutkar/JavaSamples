/*
Find the First Non-Repeating Character
Given a string, find the first non-repeating character using HashMap.
Input: "automation" → Output: 'u'

 */
package UKG.Day2;

import java.util.HashMap;

public class FindNonRepeatingChar {

    public static void main(String[] args) {
        String inputString = "Automation Using Java";
        inputString = inputString.toLowerCase();

        HashMap<Character,Integer> charCountMap= new HashMap<>();

        for(char c:inputString.toCharArray()){
            if(!charCountMap.containsKey(c)) {
                charCountMap.put(c, 1);
            }else {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
        }

        for(char c:inputString.toCharArray()){
            if(charCountMap.get(c)==1) {
                System.out.println("First Non Repeating Character: "+c);
                break;
            }
        }
    }
}
