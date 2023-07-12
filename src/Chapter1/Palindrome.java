package Chapter1;

public class Palindrome {


    public static void main(String[] args) {

        String str = "rodaar";


        int left =0;
        int right = str.length()-1;
        boolean isPalindrome = true;

        while (left <= right){

            if (str.charAt(left)== str.charAt(right)){
                left++;
                right--;
            }else {
                isPalindrome= false;
                break;
            }
        }

        if (isPalindrome == false){
            System.out.println(" the word is not a palindrome");
        }
        else {
            System.out.println(" it is a palnindrome");
        }



    }
}
