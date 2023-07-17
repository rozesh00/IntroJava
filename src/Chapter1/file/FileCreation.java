package Chapter1.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.*;
public class FileCreation extends Thread {
    public static void main(String[] args) throws IOException  {

        String filePathComplete ="D:\\JAVA\\IntroJava/HelloJava.txt";
        File createF = new File(filePathComplete);

        if(createF.exists() == false){
            createF.createNewFile();
        }
        System.out.println("created file:"+ filePathComplete);


        if(createF.isDirectory()){
            System.out.println("creation is of type folder");
        }
        System.out.println("creation is of type file");


        //File Deletion Operation

        String fileComplet = "D:\\JAVA\\IntroJava/HelloJava.txt";
        File delFile = new File(fileComplet); //initialize File Object with file path

        //boolean deletd = delFile.delete(); //deleting a file, directory

        if(delFile.exists()){
            delFile.delete();

        System.out.println("Deleted file: " +fileComplet);
        }

        //File Writing
//        File writeF = new File(fileComplet);
//        if(!writeF.exists()){
//            System.out.println("delete file" + fileComplet );
//        }
//        FileWriter fileWrite = new FileWriter(writeF);
//        fileWrite.write(fil);



/*
To read the contents of a file, you can use various input stream classes such as FileInputStream
or BufferedReader
 */
        // Using FileInputStream
        FileInputStream fileInputStream = new FileInputStream("D:\\JAVA\\IntroJava/HelloJava.txt");
// Read file contents using fileInputStream

// Using BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\JAVA\\IntroJava/HelloJava.txt"));
// Read file contents using bufferedReader


    }
}
