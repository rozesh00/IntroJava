package Chapter1.file;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNavigation {
    public static void main(String[] args) {


        File directoryFiles= new File("D:\\JAVA\\IntroJava");
        //storing all the files and directories in the array
        File[] arrFiles = directoryFiles.listFiles();

        for (File oupt: arrFiles){
            //prints each files or direcory
            System.out.println(oupt );
        }



        System.out.println("File name: " + directoryFiles.getName());
        System.out.println("File size: " + directoryFiles.length() + " bytes");
        System.out.println("Can read: " + directoryFiles.canRead());
        System.out.println("Can write: " + directoryFiles.canWrite());
        System.out.println("Can execute: " + directoryFiles.canExecute());


        //To move a file or directory from one location to another

        Path srcPath = Paths.get("path/to/source/file.txt");
        Path destiPath = Paths.get("path/to/source/file.txt");

        try {
            Files.move(srcPath, destiPath);
            System.out.println("File moved sucessfully");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
