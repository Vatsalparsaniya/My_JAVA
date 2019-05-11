//program about take a string and chack whether it is palindrone or not.
import java.util.Scanner;

public class Palindrone{

    static String reverseString(String str){
        String s = "";
        int l = str.length();
        for(int i=0;i<l;i++){
            s = s + str.charAt(l-i-1);
        }
        return s;
    }

    static boolean isPalindrone(String str){
        if(str.equals(reverseString(str)))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(reverseString(str));
        System.out.println(isPalindrone(str));
    }
}
