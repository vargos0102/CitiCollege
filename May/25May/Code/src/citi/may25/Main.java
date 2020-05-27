package citi.may25;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {

        try{
            // write your code here

            File fileObj = new File("my-file.txt");
            if(fileObj.createNewFile())
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("File already exists");
            }

            FileWriter fileWriter = new FileWriter("my-file.txt",true);
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write("Hello there! ");
            fileWriter.write(System.getProperty("line.separator"));
            fileWriter.write("How is your day going?");
            fileWriter.close();
            System.out.println("Successfully written into file");

            File noteObj = new File("my-file.txt");

            if(noteObj.exists())
            {
                System.out.println("File exists");
                System.out.println("Name of the file: "+ noteObj.getName());
                System.out.println("Absolute path:"+ noteObj.getAbsolutePath());
                System.out.println("Writeable:"+ noteObj.canWrite());
                System.out.println("Readable:"+ noteObj.canRead());
                System.out.println("File size in bytes:"+ noteObj.length());

                long milliSeconds  = noteObj.lastModified();
                Date dt = new Date(milliSeconds);
                System.out.println("Last Modified:" + dt);
            }
            else
            {
                System.out.println("File does not exists");
            }


        } catch (Exception e)
        {
            System.out.println("Exception has occurred, Details:"+e);
        }
    }
}
