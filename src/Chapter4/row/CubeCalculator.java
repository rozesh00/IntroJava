package Chapter4.row;

import java.util.Scanner;
/*
Write a program that reads strings from the user until the user inputs the string "end". As long as
 the input is not "end", the program should handle the input as an integer and print the cube of
 the number provided (i.e., number _ number _ number).
 */
public class CubeCalculator {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number or \"end \" to stop");
            String inpt = newScan.nextLine(); //if you put this statement out of while loop, then it will print the
            //first number indefinitely, for eg, if input is 3, then the system prints 27 27 27 27 27 27 27

            if(inpt.equals("end")){
                break;
            }
            try {
                int number = Integer.parseInt(inpt);
//                int cube = number * number*number;
//                System.out.println(cube);
                System.out.println( number * number*number);

            }catch (NumberFormatException e){
                System.out.println("-1");
            }
        }
        newScan.close();
    }
}
