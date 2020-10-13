package citi.may26;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            // write your code here

                File fileObj1 = new File("read-example.txt");

                if(fileObj1.exists())
                {
                    Scanner reader = new Scanner(fileObj1);
                    System.out.println("* Starting to read file *");
                    while (reader.hasNextLine())
                    {
                        String data = reader.nextLine();
                        if(data.contains("Pokemon"))
                        {
                            System.out.println("Found it in file: "+fileObj1.getName());
                        }

                    }
                    System.out.println("* End of read file *");
                    reader.close();
                }

            File fileObj2 = new File("read-example.txt");
            if(fileObj2.delete())
            {
                System.out.println("Deleted the file from: "+ fileObj2.getAbsolutePath());
            }
            else
            {
                System.out.println("Unable to delete file.");
            }
        }
        catch (Exception e)
        {
             e.printStackTrace();
        }
    }
}
