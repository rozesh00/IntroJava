package Chapter1;

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Hell@ W@rld t@ the f@@";
        char taget = '@';
        char replaceBy = 'o';
        //System.out.println(str.replace(taget, replaceBy)); without calling a function

        String outout = stringReplacer( str, taget, replaceBy);
        //non-static method cannot be called from a static method! try removing stating from
        //the below method
        System.out.println(" the original string:" + str);
        System.out.println("the replace string is:" + outout);


    }
    public static String stringReplacer(String str, char target, char replaceBy){
        return  str.replace(target, replaceBy);
    }


}
