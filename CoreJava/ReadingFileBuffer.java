package CoreJava;

import java.io.*;

public class ReadingFileBuffer {
    public static void main(String[] args) throws IOException
    {
        ReadingFileBuffer readingFileByte = new ReadingFileBuffer();
        String sourceFileName="SourceFile3.txt";
        String destFileName="DestFile3.txt";

        readingFileByte.createNewFile(sourceFileName);
        readingFileByte.createNewFile(destFileName);

        readingFileByte.writeToNewFile(sourceFileName,"This is new file created. Content of this file will be copied.");
        readingFileByte.writeToNewFile(sourceFileName,"This is new line");
        readingFileByte.copyContentOfFile(sourceFileName,destFileName);
    }

    public void createNewFile(String fileName) throws IOException {
        File file = new File(fileName);
            if(file.exists())
            {
                if(file.delete())
                    System.out.println("File "+file.getName()+" deleted successfully");
            }
            if (file.createNewFile()) {
                System.out.println("New File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File with name " + file.getName() + " already exists");
            }
    }

    public void writeToNewFile(String fileName, String fileContent) throws IOException {
        Writer writer =new BufferedWriter(new FileWriter(fileName,true));
        writer.append(fileContent);
        writer.close();
    }

    public void copyContentOfFile(String sourceFile,String destFile) throws IOException
    {
        // Buffer Reader and Print writer
        BufferedReader bufferedReader;
        PrintWriter printWriter;

        bufferedReader =new BufferedReader(new FileReader(sourceFile));
        printWriter =new PrintWriter(new FileWriter(destFile));

        String string;
        while((string=bufferedReader.readLine())!=null)
        {
            // Writing strings to file
            System.out.println("Read String "+string);
            printWriter.println(string);
        }
        bufferedReader.close();
        printWriter.close();
    }


}
