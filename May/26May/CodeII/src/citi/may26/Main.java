package citi.may26;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //C:\Users\chauh\Desktop
        try{
            Scanner scanObj = new Scanner(System.in);
            System.out.println("Enter the name of the file to create:");

            String fileName = scanObj.nextLine();
            File fileObj = new File("C:\\Users\\chauh\\Desktop"+fileName+".txt");
            if(fileObj.createNewFile())
            {
                System.out.println("File created..");
            }
            if(fileObj.exists())
            {
                FileWriter writerObj = new FileWriter("C:\\Users\\chauh\\Desktop\\Sample\\"+fileName +".txt");

                String userDecision;
                do{
                    System.out.println("Add text to file:");
                    String userText = scanObj.nextLine();
                    writerObj.write(userText);
                    System.out.println("Do you wish to add more content to file?");
                    userDecision=scanObj.nextLine();
                }while(userDecision.equals("y"));
                writerObj.close();
                System.out.println("File creation complete");
            }
        }
        catch(Exception e)
        {

        }

    }
}
