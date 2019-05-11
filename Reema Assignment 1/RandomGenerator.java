import java.util.Scanner;
import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args) {
        System.out.println("Random number generated is : " + getRandom());
    }

    static int getRandom(){
        System.out.println("Enter min and max (inclusive) between which you want to get random number");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min,max;
        min = scan.nextInt();
        max = scan.nextInt();
        int n = rand.nextInt(max-min+1) + min;
        return n;
    }
}
