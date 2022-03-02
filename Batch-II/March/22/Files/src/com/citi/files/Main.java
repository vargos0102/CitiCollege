package com.citi.files;

import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //escape sequence \
        File fileObj = new File("C:\\Users\\chauh\\source\\repos\\Citi College\\myfile.txt");
       try{
          if( fileObj.createNewFile())
          {
              System.out.println("File created 2..");
          }
          else
          {
              System.out.println("File already exists..");
          }
          FileWriter fileWriter = new FileWriter("C:\\Users\\chauh\\source\\repos\\Citi College\\myfile.txt", true);
          fileWriter.append("\n This is a one sample line being written into file..");
          fileWriter.close();
          System.out.println("Successfully written into file..");
       }
       catch(Exception e)
       {
       }
    }
}
