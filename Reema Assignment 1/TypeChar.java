import java.util.Scanner;

public class TypeChar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        int ch = (int)scan.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println("UPPERCASE");
        else if(ch>=97 && ch<=122)
            System.out.println("LOWERCASE");
        else
            System.out.println("SYMBOL");
    }
}
