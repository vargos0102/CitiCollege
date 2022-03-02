package com.citi.files;

import java.io.File;

import org.apache.poi.hssf

public class Main {

    public static void main(String[] args) {
	// write your code here
        File fileObj = new File("C:\\Users\\chauh\\source\\repos\\Citi College\\March\\23\\fileDeletion\\MyFiles\\myfile.txt");
        if(fileObj.delete())
        {
            System.out.println("Deleted the file: "+ fileObj.getName());
            File fileObj1 = new File("C:\\Users\\chauh\\source\\repos\\Citi College\\March\\23\\fileDeletion\\MyFiles");
            fileObj1.delete();
        }
        else
        {
            System.out.println("Failed to delete the file..");
        }
    }
}
