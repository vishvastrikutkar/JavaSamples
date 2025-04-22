package CoreJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        String filePath="Example.txt";

        try(BufferedReader reader=new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}
