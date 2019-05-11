import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(8)+1;
        System.out.println("Guess any number between 0 to 9:");
        int m= scan.nextInt();
        if(m<n) System.out.println("Lower guess");
        else if(m>n) System.out.println("Higher guess");
        else    System.out.println("You guess same number");

    }
}
