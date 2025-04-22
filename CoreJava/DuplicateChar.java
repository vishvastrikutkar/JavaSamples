package CoreJava;


import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static final Logger log = Utility.initializeLogger(Calculator.class);
    public static void main(String[] args) {
        duplicateCharUsingHashMaps("This is Fish");
        duplicateCharUsingHashMaps("aabbbccccddd");
    }

    public static void duplicateCharUsingHashMaps(String str)
    {
        if(str.isEmpty()) {
            System.out.println("Empty string.");
            return;
        }

        // Hash map to add char and its count
        Map<Character,Integer> characterIntegerMap=new HashMap<>();
        for(char c:str.toCharArray())
        {
            if(!Character.isSpaceChar(c)) {
                if (characterIntegerMap.containsKey(c)) {
                    characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
                } else {
                    characterIntegerMap.put(c, 1);
                }
            }
        }
        // Display duplicate char with count
        for(Map.Entry<Character,Integer> entry:characterIntegerMap.entrySet())
        {
            if(entry.getValue()>1)
               log.info("Duplicate char "+entry.getKey() + " found "+entry.getValue()+" times in string "+str);
        }
    }
}
