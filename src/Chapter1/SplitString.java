package Chapter1;

public class SplitString {

    public static void main(String[] args) {

        //for-each loop
        String str = "Hello, World. How, are, you";
        char special = ',';

        String[] arr = str.split("\\,"); //if special= . then \\. or \\+ depending on character

        for( String substing : arr){
            System.out.println(substing);
        }


        /*
        The code uses a for-each loop to iterate over each element in the substrings array.
The loop variable substring is of type String and represents each individual element of the array
 during each iteration. Inside the loop body, System.out.println(substring) is used to print
 the value of the current substring.
         */



    }
}
