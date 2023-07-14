package Chapter2.sub2;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<ExpecItems> arrList = new ArrayList<>();
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter your name");
        String strName = newScan.nextLine();

        while (strName.length()!=0){
            ExpecItems newItem = new ExpecItems(strName);
            //The ExpecItems class constructor is called with the newItem parameter,
            // which sets the strName and creationTime properties of the ExpecItems object.
            arrList.add(newItem); //appending object newItem to the ArrayList

            strName = newScan.nextLine();
        }
        for (ExpecItems newVariable: arrList) { //For each Item object, we call the toString() method,
            if(newVariable.getName()=="") {
                System.out.println("Somethng wrong");
            }
            System.out.println(newVariable);//newVariable is type ExpectItems

            //So, when this for-each loop is executed, it will iterate over each ExpecItems object in the arrList
            // list one by one. For each iteration, the current ExpecItems object is assigned to the newVariable
        }

        }

}
