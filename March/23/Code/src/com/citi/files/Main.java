package com.citi.files;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            File fileObj = new File("C:\\Users\\chauh\\source\\repos\\Citi College\\March\\23\\Code\\myfile.txt");
            Scanner myScanner = new Scanner(fileObj);
            while (myScanner.hasNextLine())
            {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
            myScanner.close();
        }
        catch(Exception e)
        {

        }
    }
}
