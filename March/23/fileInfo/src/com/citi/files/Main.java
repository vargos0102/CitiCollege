package com.citi.files;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File fileObj = new File("C:\\Users\\chauh\\source\\repos\\Citi College\\March\\23\\fileInfo\\myfile.txt");
        if(fileObj.exists())
        {
            System.out.println("File Name: "+ fileObj.getName());
            System.out.println("File Absolute path: "+ fileObj.getAbsolutePath());
            System.out.println("File Can Write: "+ fileObj.canWrite());
            System.out.println("File Can Read: "+ fileObj.canRead());
            System.out.println("File size: "+ fileObj.length());
        }
        else
        {
            System.out.println("File does not exists ");
        }
    }
}
