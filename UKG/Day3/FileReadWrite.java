package UKG.Day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

    public static void main(String[] args) {

        // Set File Path
        String inputFilePath="SampleFiles\\PhoneDirectory";
        String outPutFilePath="SampleFiles\\MyPhoneContacts";

        // Read File
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer= new BufferedWriter(new FileWriter(outPutFilePath,true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File content copied successfully.");
        } catch (Exception e) {
            System.out.println("Error while processing files "+e.getMessage());

        }


    }
}
