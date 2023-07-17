package Chapter4.row;

import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileSys {
    public static void main(String[] args) {


        //String nullString = null;
       // int length = nullString.length(); // This line will throw NullPointerException


    //A file is read from the project root by default ( when new Scanner(Paths.get("file.txt")) ,
        // is called) i.e., the folder that contains the folder src and the file pom.xml (outside src)

        //the scanner should be inside the try statement
        try(Scanner scanInput = new Scanner(Paths.get("Hello.txt"))){

            // we read the file until all lines have been read
            while (scanInput.hasNextLine()){
                // we read one line
                String row = scanInput.nextLine();
                // we print the line that we read
                System.out.println(row);
            }

        }catch (Exception e){
            System.out.println("Error " + e.getMessage());

        }
    }
  /*
  NB! If a constructor calls another constructor, the constructor call must be the
   first command in the constructor
  public Person(String name) {
    this(name, 0);
    //here the code of the second constructor is run, and the age is set to 0
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}

   */
}
