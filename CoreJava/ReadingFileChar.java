package CoreJava;

import java.io.*;

public class ReadingFileChar {
    public static void main(String[] args) throws IOException
    {
        ReadingFileChar readingFileByte = new ReadingFileChar();
        String sourceFileName="SourceFile2.txt";
        String destFileName="DestFile2.txt";

        readingFileByte.createNewFile(sourceFileName);
        readingFileByte.createNewFile(destFileName);

        readingFileByte.writeToNewFile(sourceFileName,"This is new file created. Content of this file will be copied.");
        readingFileByte.writeToNewFile(sourceFileName,"This is new file created. Content of this file will be copied.");
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
        FileWriter fileWriter=new FileWriter(fileName,true);
        fileWriter.append(fileContent);
        fileWriter.close();
    }

    public void copyContentOfFile(String sourceFile,String destFile) throws IOException
    {
        FileReader fileReader;
        FileWriter fileWriter;

        fileReader=new FileReader(sourceFile);
        fileWriter =new FileWriter(destFile);

        int c;
        while((c=fileReader.read())!=-1)
        {
            // Writing char to file
            System.out.println("Read char "+(char)c);
            fileWriter.write(c);
        }
        fileReader.close();
        fileWriter.close();
    }
}
