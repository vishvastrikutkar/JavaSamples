package Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;


public class Map_PhoneDirectory_HT {
    public static void main(String[] args) throws IOException {


        // Set File Path
        String filePath="SampleFiles\\PhoneDirectory";

        // Read all lines and store in List of strings
        List<String> lines= Files.readAllLines(Paths.get(filePath));

        // First line of the file is number of phonebook entries
        int numberOfEntries = Integer.parseInt(lines.getFirst());

        // Let's calculate from which line queries will start
        int queryStartLine =(numberOfEntries*2)+1;
        HashMap<String,Integer> hashMap = new HashMap<>();

        // Read lines from 1 to number of entries multiplied by 2 as every entry will have name and phone number.
        int i = 1;
        while (i <=numberOfEntries*2)
        {
            String name;
            String phoneNumber;
            name = lines.get(i);
            phoneNumber = lines.get(i+1);
            hashMap.put(name,Integer.parseInt(phoneNumber));
            i=i+2;
        }
        // Display Phone directory
        System.out.println("\nPhone Directory:");
        for (String k : hashMap.keySet()) {
            Integer v = hashMap.get(k);
            System.out.println("Name: " + k + ", Phone Number: " + v);
        }
        // Read query lines
        while(queryStartLine <lines.size())
        {
            String query = lines.get(queryStartLine);
            if(hashMap.containsKey(query)) {
                System.out.println(query + " = " + hashMap.get(query));
            }else {
                System.out.println("Not found");
            }
            queryStartLine++;
        }

    }
}

