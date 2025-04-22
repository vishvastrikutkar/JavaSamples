package CoreJava;

import java.io.*;

public class ReadingFileByte {
    public static void main(String[] args) throws IOException
    {
        ReadingFileByte readingFileByte = new ReadingFileByte();
        String sourceFileName="SourceFile1.txt";
        String destFileName="DestFile1.txt";

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
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        fileInputStream=new FileInputStream(sourceFile);
        fileOutputStream=new FileOutputStream(destFile);

        int c;
        while((c=fileInputStream.read())!=-1)
        {
            // Writing bytes to file
            System.out.println("Read Byte "+c);
            fileOutputStream.write(c);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }


}
