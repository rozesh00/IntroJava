package Chapter2;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {


        int[] arr = {-1, 2, 3, -4, -5};

        int[] gapArr ={2, 10, 45, -2, 3, -26, };
        Arrays.sort(gapArr);
        System.out.println("Sorted Array: ");
        for(int num: gapArr){
            System.out.print( num+" " );
        }

        int ans= gapCalculator(gapArr);
        System.out.println("\nThe maximum gap in an array is: " + ans);

        int[] altArray1={1,-2, 3};
        int[] altArray3={-1,2,-3,-1};

        System.out.println(negDominant(arr));

        boolean ans1= alternateNum(altArray1);
        boolean ans3= alternateNum(altArray3);

        System.out.println("Array 1 is alternating? "+ ans1);
        System.out.println("Aray 3 is alternating?"+ ans3);
    }

    /*
       Write a Java program that checks whether an array is negative dominant or not.
       If the array is negative dominant return true otherwise false.
        */
    public  static boolean negDominant(int[] newArr) {
        int negCount = 0;
        int posiCount = 0;

        for (int i = 0; i < newArr.length; i++) {

            if (newArr[i] < 0) {
                negCount += 1;
            } else {
                posiCount += 1;
            }

        }
        if (negCount > posiCount) {
            System.out.println("THe array is negative dominant");
            return true;
        }return false;


    }
    /*
    Write a Java program that checks whether an array of integers alternates between positive and
    negative values.
     */

    public static boolean alternateNum(int[] newArr){

        if(newArr.length <2){
            return false;
        }

        for (int i=1; i<newArr.length;i++){
            if(newArr[i]>0 && newArr[i-1]>0){
                return false;

            } else if (newArr[i]<0 && newArr[i-1]<0) {
                return false;

            }

        }
        return true;


        }

        public static int gapCalculator(int[] newArr){
        int maxNum = 0;

        for (int i =1; i< newArr.length; i++){

            if((newArr[i]-newArr[i-1])> maxNum){
                maxNum = (newArr[i]-newArr[i-1]);
            }else {
                continue;
            }


        }
        return maxNum;
        }


    }

