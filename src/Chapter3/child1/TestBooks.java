package Chapter3.child1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

/*
Write a program that first reads book information from the user. The details to be asked for each book
include the title, the number of pages and the publication year. Entering an empty string as the name
 of the book ends the reading process.

 After this the user is asked for what is to be printed.
  If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and
  the publication years. However, if the user enters the string "name", only the book titles are printed.
 */

public class TestBooks {

    public static void main(String[] args) {

        ArrayList<Book1> arrBooks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        while (true){

            System.out.println("Enter Booktitle: ");
            String tile = scan.nextLine();

            if(tile.length()==0){
                break;
            }
            System.out.println("Pages: ");
            int pages =    Integer.parseInt(scan.nextLine());
            System.out.println(" year: ");
            int year = Integer.parseInt(scan.nextLine());
            //Integer.parseInt(...) converts the trimmed input string to an integer value
            Book1 addBook = new Book1(tile, pages, year);
            arrBooks.add(addBook);

        }
        System.out.println("what information? name or everything");
        String inpt = scan.nextLine();
        for (Book1 outptBooks: arrBooks){
            if(inpt.equals("everything")){
                System.out.println(outptBooks);

       //In Java, the equals() method is used to compare the content or values of objects,
        // while the == operator is used to compare the references or memory addresses of objects
            } else if (inpt.equals("name")) {
                System.out.println(outptBooks.getTitle());
                
            }

        }




    }
}
