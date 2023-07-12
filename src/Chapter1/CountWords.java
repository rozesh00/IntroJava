package Chapter1;

public class CountWords {

    public static void main(String[] args) {
        String str = "Hello World. Welcome to the Jungle!";
        /*
        split("\\s+") will split the string into string of array with separator as space or multiple spaces.
         \s+ is a regular expression for one or more spaces.
         */
        String[] arr = str.split("\\S+"); // each word is stored in each boxes of the array arr

        int count = arr.length;
        System.out.println("The number of words: " + count);


        //THIS MIGHT NOT WORK ALWAYS IF THERE ARE MULTIPLE SPACES
//        int count =1;
//
//        for (int i =0; i < str.length(); i++){
//
//            if(str.charAt(i)== ' '){ //can't do " " because it is a string but charAt(i) is a character
//                count++;
//            }else {
//                continue;
//            }
//        }
//        System.out.println("Total number of words: " +  count);

 }
}
