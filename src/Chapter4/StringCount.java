package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        int count =0;
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a word");




        while(true){
            String inpt = sca.nextLine();
            strArr.add(inpt);
            if(inpt.equals("end")){
                break;
            }

        }
        System.out.println("The words you entered are: ");
        for (String printOut: strArr ){
            System.out.println(printOut);
        }
        System.out.println("Total word counts: " +strArr.size());

    }
}
