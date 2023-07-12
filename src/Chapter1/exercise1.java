package Chapter1;

import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {

        /*
        Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”
         */
        int n1 = 7;
        int n2=4;

        System.out.println(Math.exp(n1) );
        System.out.println(Math.sqrt(n2)); //returns double
        //Math.max(2.5, 3)
        //(int) (Math.random()*10) returns a random int between 0 and 9
        //a+Math.random()*b between a and (a+b) excluding

        String str1 = "Hello World. Welcolme";
        boolean outpt = str1.contains("World"); //true if World is a substring in the string str1
        System.out.println("There is/is not the subsutring"+ outpt);



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first num");
        double num1 = scan.nextDouble();
        System.out.println("Enter Second num");
        double num2 = scan.nextDouble();
        System.out.println("third num");
        double num3 = scan.nextDouble();

        double x1 = (-num2+(Math.pow((num2*num2)-(4*num1*num3), 0.5)))/2*num1;
        double x2 = (-num2-(Math.pow((num2*num2)-(4*num1*num3), 0.5)))/2*num1;

        if (((num2*num2)-(4*num1*num3)) > 0){
            System.out.println("the eqaution has 2 roots");


        }if(((num2*num2)-(4*num1*num3)) ==0){
            System.out.println("One real root");
        }else {
            System.out.println("No real root");
        }

    }
}
